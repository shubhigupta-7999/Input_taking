// print the foollowing pattern
//1 
// 1 3 
// 1 3 5 
// 1 3 5 7 
// 1 3 5 7 9 
package Array.Pattern_Printing;
public class Odd_Number_Traingle {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print((2*j-1) + " ");
            }
            System.out.println();
        }
    }
}