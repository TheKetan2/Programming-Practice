package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    /*
    Here are some examples:
-	4 parameters are specified: left, top, width, and height
-	width/height is not specified (both are 0)
-	height is not specified (it is equal to the width), we'll create a square
-	create a copy of another rectangle passed as an argument
    
    
    Requirements:
    1. The program must not read data from the keyboard.
    2. The Rectangle class must have int variables top, left, width and height.
    3. The class must have at least one initialize method.
    4. The class must have at least two initialize methods.
    5. The class must have at least three initialize methods.
    6. The class must have at least four initialize methods.
    
    
    */
    public int left;
    public int top;
    public int height;
    public int width;
    Rectangle rect = new Rectangle();
    
    public void initialize(int left, int top, int height, int width){
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }
    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top, int height){
        this.left = left;
        this.top = top;
        this.height = height;
    }
    public void initialize(Rectangle rectangle){
        this.rect = rectangle;
    }

    public static void main(String[] args) {

    }
}
