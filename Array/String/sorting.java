package Array.String;

import java.util.Arrays;

public class sorting {
public static void main(String[] args){
    String s = "Shubhi";
    char[] ch = s.toCharArray();
    for(char c : ch){
        System.out.print(c + " ");
    }
    System.out.println();
   Arrays.sort(ch);
    for(char c : ch){
        System.out.print(c + " ");
    }
    System.out.println();

}

}