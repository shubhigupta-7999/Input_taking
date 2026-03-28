package Array;
public class PassingArraytoMethods {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
            change(x);
            System.out.println(x);

    }
//passbyvalue
    public static void change(int x) {
        x = 10;
    }
}