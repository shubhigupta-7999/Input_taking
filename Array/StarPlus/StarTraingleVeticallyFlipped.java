package Array.StarPlus;

import java.util.Scanner;

public class StarTraingleVeticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the star triangle number");
        int n = sc.nextInt();
        for(int i = n; i>=1; i++){
            for(int j = 1; j<=n; j++){
                for(int k = 1; k<=n; k++){
                    if (i+j>n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                        
                    }
                    
            }

            System.out.println();
        }
    }
}
}
