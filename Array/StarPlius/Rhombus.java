package Array.StarPlius;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the rhombus:");
        int n = sc.nextInt();
       // int n = 5; // Number of rows for the rhombus
        for(int i = 1; i <= n; i++) {
            // Print spaces before stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i = n - 1; i >= 1; i--) {
            // Print spaces before stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
