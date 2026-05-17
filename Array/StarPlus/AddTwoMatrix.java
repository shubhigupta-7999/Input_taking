package Array.StarPlus;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,3,5 }, {3,5,6}, {4,6,7}};
        int[][] b = {{1,35,5 }, {83,5,6}, {94,6,7}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];
            for(int i = 0; i<m; i++){
                for(int j =0; j<n; j++){
                    res[i][j] = a[i][j]+b[i][j];
                }

            }
            for(int i = 0; i<m; i++){
                for(int j =0; j<n; j++){
                    System.out.print(res[i][j] + " ");
            
                }
                    System.out.println();
            }

    }
}
