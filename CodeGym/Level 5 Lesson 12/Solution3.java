package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/
/*
Tom and Jerry
Create Dog, Cat, and Mouse classes.
Add three fields of your choice to each class. 
Create objects for the characters in the cartoon "Tom and Jerry". 
You'll recall there are quite a few.

For example:
Mouse jerryMouse = new Mouse("Jerry", 5, 2),
where 5 is the height in inches,
and 2 is the length of his tail in inches.
*/
public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //write your code here
        Cat jerryCat = new Cat("Mini",10, 3);
        Dog jerryDog = new Dog("Moti", 4, 4);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat{
        String name;
        int age, weight;
        
        public Cat(String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
    public static class Dog{
        String name;
        int age, weight;
        
        public Dog(String name, int age, int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    //write your code here
}
