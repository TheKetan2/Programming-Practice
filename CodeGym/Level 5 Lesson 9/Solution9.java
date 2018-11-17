package com.codegym.task.task05.task0519;

/* 
Walking in circles

*/


public class Circle {
    //write your code here
    /*
     centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color
    */
    
    int color,centerX, centerY, radius,width;
    
    public Circle(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;    
    }
    
    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        
    }
    
    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        
    }
    public static void main(String[] args) {

    }
}
