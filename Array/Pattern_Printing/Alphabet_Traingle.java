// print the following pattern
// A
// A B
// A B C
// A B C D


package Array.Pattern_Printing;

public class Alphabet_Traingle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
        for(int m=0; m<5; m++){
            for(int n=0; n<=m; n++){
                System.out.print(m + " ");
            }
            System.out.println();
       
        }
// print the following pattern
//1
//A B
//1 2 3
//A B C D
//1 2 3 4 5
        for(int k=1; k<=5; k++){
            for(int l=0; l<k; l++){
                if(k%2==0){
                    System.out.print((char)(65 + l) + " ");
                }
                else{
                    System.out.print(l + " ");
                }
            }
            System.out.println();
        }
        //print the following pattern
        //******
        //***** 
        //****
        //***
        //** 
        //* 
        for(int s=5; s>=0 ; s--){
            for(int t=0; t<=s; t++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
