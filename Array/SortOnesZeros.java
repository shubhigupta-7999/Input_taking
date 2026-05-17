package Array;

public class SortOnesZeros {

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,0,1,0};
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            } 
            else if (arr[j] == 1) {   // FIX: j ko check karo
                j--;
            } 
            else {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // FIX: datatype likhna zaroori hai
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}