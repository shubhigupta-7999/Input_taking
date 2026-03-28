package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {23,34,34,45,55,78};
        int n = arr.length;
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        // for(int i = 0; i < n/2; i++){
        //     int j = n - 1 - i;
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
       // }

       // Two pointer approach
    //    int i = 0, j = n - 1;
    //      while(i <= j){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         i++;
    //         j--;
      //  }
// Using swap function
     // int i = 1, j = 3;// part of array to be reversed
      int i = 0, j = n - 1;// whole array to be reversed
        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
