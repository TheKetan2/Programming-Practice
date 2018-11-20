import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[]) throws Exception {

        //Write code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int jump = Integer.parseInt(br.readLine());

        int less = Integer.parseInt(br.readLine());

        int numWalls = Integer.parseInt(br.readLine());

        int ans = 0;

        for (int i = 0; i < numWalls; i++) {
            int height = Integer.parseInt(br.readLine());
            ans += helper(height, jump, less);

        }


        System.out.println(ans);


    }
    public static int helper(int h, int j, int less){
        int count = 0;
        int sum = 0;
        while(sum < h){
            sum += j;
            j -=less;
            count++;
        }
        return count;

    }

}