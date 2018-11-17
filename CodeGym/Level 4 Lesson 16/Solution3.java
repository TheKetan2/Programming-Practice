package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr = 0,sum = 0;
        while(arr!= -1){
            arr= Integer.parseInt(br.readLine());
            sum+=arr;
        }
        System.out.println(sum);
    }
}
