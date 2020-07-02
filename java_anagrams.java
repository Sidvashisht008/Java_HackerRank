import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.length()!=b.length()){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-65]++;
        }
        for(int i=0;i<b.length();i++){
            arr[b.charAt(i)-65]--;
        }
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                flag=1;
                break;
            }
        }
        if(flag==0){
             return true;
        }
        return false;

    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
