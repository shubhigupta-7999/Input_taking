package Array;
public class NextGreatestElement {
public static void main(String[] args) {
    int[] a = {4,5,2,10,8};
    int n = a.length;
    int[] res = new int[n];
    res[n-1] = -1; // Last element has no next greatest element
    // for(int i=0; i<n-1; i++){
    //     int max = Integer.MIN_VALUE;
    //     for(int j=i+1; j<n; j++){
    //         if(a[j]>a[i]){
    //             max = Math.max(max, a[j]);
    //         }
    //     }
    //     res[i] = max;
    // }
    //method 2
    for(int i=n-2; i>=0; i--){
        if(a[i+1]>a[i]){
            res[i] = a[i+1];
        }
        else{
            int j = i+1;
            while(j<n && a[j]<=a[i]){
                j++;
            }
            if(j<n){
                res[i] = a[j];
            }
            else{
                res[i] = -1;
            }
        }
    }
for(int elem : res ){
        System.out.print(elem + " ");
    }
    for(int elem : a){
        System.out.print(elem + " ");
    }

}
}