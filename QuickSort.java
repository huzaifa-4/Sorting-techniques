public class QuickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                // jo new value ha pivot sy choti usko replace karny k lia
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // pivot ko apni position par store karny k lia
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pidx = partition(arr, low, high);   //
            quickSort(arr, low, pidx-1);    //pivot sy choti value
            quickSort(arr, pidx+1, high);   //pivot sy bhari value 
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,3,5,9,8,7,1,4};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        //print karwany k lia
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


