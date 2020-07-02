import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lo=0;
        int hi=A.length()-1;
        int flag=0;
        while(lo<hi){
            if(A.charAt(lo)!=A.charAt(hi)){
                flag=1;
                break;
            }
            hi--;
            lo++;
        }
        if(flag==1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}



