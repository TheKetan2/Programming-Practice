package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        /*
        A name is a name
        Use the keyboard to enter a name.
        Use the keyboard to enter a birth date (three numbers): yyyy, mm, dd.
        
        Display the following:
        "My name is *name*.
        I was born on mm/dd/yyyy"
        
        Example output:
        My name is Kevin.
        I was born on 2/15/198
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int yyyy = Integer.parseInt(br.readLine());
        int mm = Integer.parseInt(br.readLine());
        int dd = Integer.parseInt(br.readLine());
      
        System.out.println("My name is "+name+".\nI was born on "+mm+"/"+dd+"/"+yyyy);
        
        
    }
}
