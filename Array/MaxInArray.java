package Array;
public class MaxInArray {
public static void main(String[] args) {
    int[][] arr = {{1,4,5,7,8},{56,2,34,55,67},{6,2,34,55,767}};
    int mx = Integer.MIN_VALUE;
    int m = arr.length;
    int n = arr[0].length;
    
for(int i =0; i<m; i++){
    for(int j =0; j<n; j++){
          mx = Math.max(mx, arr[i][j]);
          
    }
}
System.out.println(mx);
}
    
}