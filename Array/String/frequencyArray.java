package Array.String;
import java.util.*;

public class frequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[26]; // for 'a' to 'z'

        // Count frequency
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Find max frequency
        int max = 0;
        char result = 'a';

        for(int i = 0; i < 26; i++){
            if(freq[i] > max){
                max = freq[i];
                result = (char)(i + 'a');
            }
        }

        System.out.println(result);
    }
}