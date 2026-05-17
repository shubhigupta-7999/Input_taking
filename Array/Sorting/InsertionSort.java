package Array.Sorting;
public class InsertionSort {
public static void main(String[] args){
int arr[] = {3,45,2,67,23,56,9};
for (int i = 1; i < arr.length; i++) {
    for(int j = i; j > 0; j--){
        if(arr[j] < arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        } else {
            break;
        }
    }
}
for (int num : arr) {
    System.out.print(num + " ");
}






}
}