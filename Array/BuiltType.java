package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuiltType {
    public static void main(String[] args) {
        int[] arrr = {23,94,34,45,55,78};

        //for each loop
         for(int i :arrr){
            System.out.print(i + " ");
        }
        Arrays.sort(arrr);
        System.out.println();
        for(int i :arrr){
            System.out.print(i + " ");
        }
    }
    
    
}
