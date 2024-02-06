public class ShellSort{

    public static void shellSort(int[] arr){

        int n = arr.length;
        for(int gap = n / 2; gap >= 1; gap = gap / 2){
            for(int j = gap; j < n; j++){
                for(int i = j - gap; i >= 0 && arr[i + gap] < arr[i]; i = i - gap){
                    int temp = arr[i];
                    arr[i] = arr[i+ gap];
                    arr[i+ gap] = temp;
                }
            }             
        }
    }
    public static void main(String[] args){
        int[] arr = {19,12,14,113,2,4,5,6,7,8};
        shellSort(arr);
        System.out.print("Sorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

    }

}


/* 
                    Algorithm
1st loop = gap = n/2 sey gap nikalta ha r gap = gap/2 yeh har iteration me divide hota rahy ga untill 1 na ajaye
2nd loop = start ho gi current gap sy array k lat tak j index k us element k represent kary ga jo possibly swap hoga
3rd loop = loop start honi j-gap sey r yeh wo element ha jo compare ho k swap hoga
i>=0 && arr[i+gap]<arr[i] loop us wqt tak chaly gi jab tak current index i 0 tak ni jata.
r jab tak i+gap k index py jo element ha wo i waly index sey chota nii hota
i=i-gap swap karnyk baad leftwards barhtaha untill i zero na ho jaye ya j ko apni aasli jagha na mil jaye 
*/
