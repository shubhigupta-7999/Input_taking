package Array.StarPlus;

import java.util.Scanner;

public class BinaryTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binarytriangle number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(j % 2 == 1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
