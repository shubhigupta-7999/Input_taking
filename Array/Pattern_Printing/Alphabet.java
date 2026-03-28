// print the following pattern
// A B C D E
// A B C D E
// A B C D E
// A B C D E
// A B C D E

// 65 is the ASCII value of A and 66 is the ASCII value of B and so on. So to print the pattern we can use the ASCII values of the characters and convert them to characters using (char) type casting.
package Array.Pattern_Printing;

public class Alphabet {
    public static void main(String[] args) {

for (int i = 1; i <= 90; i++) {
            for (int j = 0; j <= 90; j++) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }

for (int k = 1; k <= 122; k++) {
    for (int l = 0; l <= 122; l++) {
        System.out.print((char)(97 + l) + " ");
    }
    System.out.println();
}
for (int m = 1; m <= 57; m++) {
    for (int n = 0; n <= 48; n++) {
        System.out.print((char)(48 + n) + " ");
    }
    System.out.println();
    
}
    }
}