import java.util.Arrays;

public class RadixSort {
    static void countingS(int arr[], int n, int p){
        int[] output = new int[n];
        int[] tempc = new int[10];
        Arrays.fill(tempc,0);
        int i;

        for(i=0; i<n; i++){
            tempc[(arr[i]/p) % 10]++;
        }

        for(i=1; i<10; i++){
            tempc[i] = tempc[i] + tempc[i-1];
        }

        for(i = n-1; i>=0; i--){
            output[tempc[(arr[i]/p) % 10]-1] = arr[i];
            tempc[(arr[i]/p) % 10]--;
        }

        for(i = 0; i<n; i++){
            arr[i] = output[i];
        }

    }
    static void radixS(int arr[], int n){
        int max = arr[0];
        for(int i=1; i< n; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }

        for(int p=1; max/p > 0; p *= 10){
            countingS(arr,n,p);
        }
    }


    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 100, 7, 11, 2, 6};

        radixS(arr, arr.length);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}