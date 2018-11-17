package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        int a = Math.abs(x2-x1);
        int b = Math.abs(y2-y1);
        return Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {

    }
}
