package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        
        String input;
        int ans = 0;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(!((input = br.readLine()).equals("sum"))){
            
            ans += Integer.parseInt(input);
        }
        System.out.println(ans);
    }
}
