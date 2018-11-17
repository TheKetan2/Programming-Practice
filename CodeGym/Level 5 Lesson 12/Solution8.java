package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double maximum = -9000000000.;

        //write your code here
        
        int N = Integer.parseInt(reader.readLine());
        
        for(int i = 0 ; i<N; i++){
            double num = Double.parseDouble(reader.readLine());
            
            if( maximum < num)
                maximum = num; 
        }
        
        
        System.out.println((int) maximum);
    }
}
