public class InsertionSort {

  public static void printArray(int arr[]){
    for(int i =0; i< arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  public static void main(String args[]){
    int arr[] = {23, 22, 14, 9, 30, 77, 80, 25, 70, 55};
    for(int i=1; i<arr.length; i++){
      int current = arr[i];
      int j = i-1;
      while(j>= 0 && arr[j]> current){
        arr[j+1] = arr[j];
        j--;
      }
      //placement
    arr[j+1]=current;
    }
    printArray(arr);
  }
}