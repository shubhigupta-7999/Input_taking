
package Array.StarPlius;
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the star pyramid:");
        int n = sc.nextInt();
         // Number of rows in the pyramid
        for(int i = 1; i <= n; i++) {
            // Print spaces before stars
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}