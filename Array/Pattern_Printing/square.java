 // Print the following pattern
 // * * * * *
 // * * * * *
 // * * * * *
 // * * * * *
// The pattern is in the form of a square and the number of rows and columns are taken as input from the user.
 // for n = 4 and m = 5
 package Array.Pattern_Printing;

 import java.util.Scanner;

 public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

// for (int i = 1; i <= 3; i++) { // for rows 
//     for (int j = 1; j <= 5; j++) {// for columns
//         System.out.print("* ");
//     }
//     System.out.println();
// }
    }
}
