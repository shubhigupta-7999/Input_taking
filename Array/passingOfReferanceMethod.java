package Array;

public class passingOfReferanceMethod {
    public static void main(String[] args) {
        int[] arr = {23,34,34,45,55,78};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    private static void change(int[] x) {
        x[0] = 100;
    }
}
