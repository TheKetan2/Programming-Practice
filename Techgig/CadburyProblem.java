/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;
public class Cadboury {
    public static void main(String args[] ) throws Exception {

        //Write code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        int N = Integer.parseInt(br.readLine());

        int P = Integer.parseInt(br.readLine());

        int Q = Integer.parseInt(br.readLine());

        int ans = 0;

        ans += helper(M,P);
        ans += helper(M,Q);
        ans += helper(N,P);
        ans += helper(N,Q);

        System.out.println(ans);
    }

    public  static int helper(int a, int b){
        int sol = 0;
        while(true){
            if(a>b){
                sol += a/b;
                a%=b;
                if(a==0)
                    break;
            }
            else if(a<b){
                sol += b/a;
                b%=a;
                if(b == 0)
                    break;
            }
            else{
                sol++;
            }
        }

        return sol;
    }
}
