package Array.String;

public class UpdateEvenPosition {
    public static void main(String[] args) {
        String str = "Shubhi gupta";
        String s = " ";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                s = s + 'a';
            } else {
                s = s + str.charAt(i);
            }
        }
        System.out.println(s);
    }
    
}
