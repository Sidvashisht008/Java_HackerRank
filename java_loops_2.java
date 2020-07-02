import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<=n-1;j++){
                int sum=0;
                for(int k=0;k<=j;k++){
                    sum+=(int)Math.pow(2,k)*b;
                }
                sum+=a;
                System.out.print(sum+" ");

            }
            System.out.println();
        }
        in.close();
    }
}