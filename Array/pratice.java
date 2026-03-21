package Array;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the elements of the Array");

       for(int i =0; i<n; i++){
        System.out.print("Enter the element " + (i+1) + ": ");
        arr[i] = sc.nextInt();
       }
       for(int i =0; i<n; i++){
        System.out.println(arr[i]);
       }

    }

}
