package Array;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,0,2};
        int n = arr.length;
        int noofzeros =0;
        int noofones =0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                noofzeros++;
            }
            else if(arr[i]==1){
                noofones++;
            }
        }
                for(int i=0; i<n; i++){
                    if(i<noofzeros){
                        arr[i]=0;
                    }
                    else if(i<noofzeros+noofones){
                        arr[i]=1;
                    }
                    else{
                        arr[i]=2;
                    }

    }
    for(int elem : arr){
    System.out.print(elem + " ");
        }
}
}
