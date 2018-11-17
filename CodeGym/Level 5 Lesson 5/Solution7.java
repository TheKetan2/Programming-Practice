package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        double sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        double number;
        number = 0;
        int i = 0;
        while((number =  Float.parseFloat(br.readLine()))!= -1){
            
                sum +=number;
                i++;
            
        }
        if(sum == 0)
            System.out.println(0.0);
        else
            System.out.println(sum/i);
    }
}

