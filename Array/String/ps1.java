package Array.String;
public class ps1{
public static void main(String[] args){
String s ="abcde";
// for(int i = 0; i < s.length(); i++){
    
//     System.out.println(s.substring(0, i) + " ");
// //System.out.println(s.substring(2));





//}

for(int i = 0; i < s.length(); i++){
    for(int j = i+1; j <= s.length(); j++){
        System.out.print(s.substring(i, j) + " ");
    }
System.out.println();

}


}
}