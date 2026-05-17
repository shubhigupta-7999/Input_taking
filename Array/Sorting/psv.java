package Array.Sorting;
public class psv {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
       int[] arr = {5, 2, 9, 1, 5, 6};
       boolean isSorted = true;
       for(int i=0; i<arr.length-1; i++){
if(arr[i] > arr[i+1]){
    isSorted = false;
    break;
}
if(isSorted){
    System.out.println("The array is sorted.");
} else {
    System.out.println("The array is not sorted.");
}
//System.out.println();

       }
    }
}