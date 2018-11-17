package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = Integer.parseInt(reader.readLine());
        
        
      
             int minimum = min( Integer.parseInt(reader.readLine()),
                             Integer.parseInt(reader.readLine()),
                             Integer.parseInt(reader.readLine()),
                             Integer.parseInt(reader.readLine()),
                             Integer.parseInt(reader.readLine()));

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
            int tempMin = a;
            
            if(tempMin > b)
                tempMin = b;
            
            if(tempMin > c)
                tempMin = c;
                
            if(tempMin > d)
                tempMin = d;
                
            if(tempMin > e)
                tempMin = e;
            return tempMin;
    }
}
