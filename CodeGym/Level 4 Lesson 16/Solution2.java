package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] arr = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());        
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
