package Array;
public class MergeTwoSortArray {
public static void main(String[] args) {
    int[] a = {1,3,5,7,9};
    int[] b = {2,4,6,8,10,15,18};
    int[] c = new int[a.length + b.length];
    int i=0, j=0, k=0;
    while (i<a.length && j<b.length) {
        if(a[i]<b[j]){
            c[k] = a[i];
            i++;
        }
        else{
            c[k] = b[j];
            j++;
        }
        k++;
    }
// If there are remaining elements in array b
    while(i<a.length){
        c[k] = a[i];
        i++;
        k++;
    }
// If there are remaining elements in array b
    while(j<b.length){
        c[k] = b[j];
        j++;
        k++;
    }


for( int elem : c){
    System.out.print(elem + " ");

}
    
}
}