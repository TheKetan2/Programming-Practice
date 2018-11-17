import java.io.*;

public class Solution{

    public static void main(String[] args){
        int p1, p2, flag = 1, k,t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while(t>=0){
            p1 = Integer.parseInt(br.readLine());
            p2 = Integer.parseInt(br.readLine());
            k = Integer.parseInt(br.readLine());
            if(Math.abs(p1-p2)>=k){
                flag++;
            }
            if(flag%2 == 0)
                System.out.println("COOK");
            else
                System.out.println("CHEF");

            t--;

        }
    }
}