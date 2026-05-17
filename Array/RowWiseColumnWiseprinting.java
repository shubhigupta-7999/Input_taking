package Array;
public class RowWiseColumnWiseprinting{
public static void main(String[] args) {
    int[][] arr = {{1,3,4} ,{2,3,5},{2,4,5}};
    int m = arr.length;
    int n = arr[0].length;
    for(int i = 0; i<m; i++){
        for(int j = 0; j<n; j++){

            System.out.print(arr[i][j] + " ");
        
    }
System.out.println();



    }








}





}