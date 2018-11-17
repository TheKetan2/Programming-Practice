package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

/*
Requirements:
1. The readString method must read and return a String.
2. The readInt method must read and return an int.
3. The readDouble method must read and return a double.
4. The readBoolean method must read and return a boolean value
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());

    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(br.readLine());

    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(br.readLine());

    }

    public static void main(String[] args) {

    }
}
