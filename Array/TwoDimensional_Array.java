package Array;

import java.util.Scanner;

public class TwoDimensional_Array {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int[][] arr = new int[4][5];
        
        int m = arr.length;       // number of rows
        int n = arr[0].length;    // number of columns

        // Filling the 2D array with values
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " "); // FIXED (arr[i][j] → sc.nextInt())
                arr[i][j] = sc.nextInt();   // FIXED (scanner → sc)
            }
        }

        // Printing the 2D array
        System.out.println("Matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // good practice
    }
}