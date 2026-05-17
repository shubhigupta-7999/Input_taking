package Array.String;
public class modifyCharacterinString {
    public static void main(String[] args) {
        String str = "Hello World";
//        System.out.println(modifiedStr);
str = str.substring(0, 3) + 'y' + str.substring(4);
System.out.println(str);
    }
}
