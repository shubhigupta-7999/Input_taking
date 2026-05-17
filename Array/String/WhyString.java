package Array.String;

public class WhyString {
    public static void main(String[] args) {
       // String str = "Hello World";
        // str[0] = 'h';// not allowed because string is immutable
      //  System.out.println(str);

      char ch[] = {'S','H','U','B','H','I'};
        for(char elem: ch){}
        System.out.println(ch);
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        String str = "Shubhi";
        System.out.println(str);

    }
}