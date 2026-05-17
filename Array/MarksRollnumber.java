package Array;

import java.util.Scanner;

public class MarksRollnumber {
    public static void main(String[] args) {
       // int m = arr.length;       // number of rows
       // int n = arr[0].length;    // number of columns
        Scanner sc  = new Scanner(System.in);
        int[][] arr = new int[2][2];
          for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
System.out.print(arr[i][j]);
                 arr[i][j] = sc.nextInt();
            }
          }


for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
System.out.print(arr[i][j] + " ");
            }
          
        System.out.println();
        }
    }
}
