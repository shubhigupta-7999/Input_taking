// print the following traigle pattern
// *
// ** 
// ***
// ****

package Array.Pattern_Printing;

import java.util.Scanner;

public class Traingle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
