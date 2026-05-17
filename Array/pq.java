package Array;

import java.util.Scanner;

public class pq {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int[][] arr = new int[4][5];
        int m = arr.length;       
        int n = arr[0].length;    

        // Taking input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing matrix properly
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " "); // FIXED
            }
            System.out.println(); // new line after each row
        }

        sc.close();
    }
}
