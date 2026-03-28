package Array;

import java.util.Scanner;

public class function {
    
public static int MultiplyProduct(int a ,int b){



return a*b;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int result = MultiplyProduct(a, b);
    System.out.println("The product of a and b is " + result);


}
}
