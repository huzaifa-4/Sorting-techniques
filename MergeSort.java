public class MergeSort {
    
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2; // mid nikala
        divide(arr, si, mid); // divide k baad jo 1st arr bany gi
        divide(arr, mid+1, ei); // divide k baad jo second arr bany gi 
        conqure(arr, si, mid, ei); // merge karny k lia
    }


    public static void conqure(int arr[], int si, int mid, int ei){
    int merged[] = new int [ei - si + 1]; 
       
    // int merged[] = ik new arr banai ha merged k naam sey
    // new int[] = original array ha r isk parameter me arr ki total length ha

    int idx1 = si;
    int idx2 = mid + 1;
    int x = 0; // merged k index ko track karny k lia

    while(idx1 <= mid && idx2 <= ei){

        if(arr[idx1] <= arr[idx2]){ 
            merged[x] = arr[idx1];
            x++; idx1++;
        } else{
            merged[x] = arr[idx2];
            x++; idx2++;
        }

    } //loop will continue jab tak 2ono arrays mn comapiring hogi

    while(idx1 <= mid){
        merged[x++] = arr[idx1++];
    }
    while(idx2 <= ei){
        merged[x++] = arr[idx2++];
    }

    // merged array k elemnts ko original array k andar store karwan k lia new loop
    for(int i=0, j=si; i < merged.length; i++, j++){
        arr[j] = merged[i];
    }
}
    

    public static void main(String[] args) {
        int arr[] = {5,7,3,8,2,9,12,45,6,1};
        int n = arr.length;
        divide(arr, 0, n-1);
        // print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


