package Array.Sorting;
import java.util.Arrays;
public class builtInSorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        for(int i : arr){
            System.out.print(i + " ");
        }
        // Sort the array using built-in method
        System.out.println();
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        // Print the sorted array
       // System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}