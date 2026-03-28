package Array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {23,34,34,45,55,78};
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
//         int[] nums = arr;//shallow copy
// nums[0] = 100;
//         for(int i : nums){
//             System.out.print(i + " ");
//             System.out.println(arr[0]);
//         }
        int[] nums1 = Arrays.copyOf(arr, arr.length);//deep copy
        for(int i : nums1){
            System.out.print(i + " ");
            nums1[0] = 100;
            System.out.println(arr[0]);
        }
    }
}
