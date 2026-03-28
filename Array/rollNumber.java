package Array;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr={10 , 23, 56, 678, 67,56};
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i]<35){
                System.out.println("Roll number " + arr[i] + " is failed.");
            } else {
                System.out.println("Roll number " + arr[i] + " is passed.");
            }
            
        }
        
int[] arr1 ={10,34,45,56,67,78,89,90,23,45};
int n1 = arr1.length;
System.out.println(arr1[0]);
    }
}

