package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    /*
    Requirements:6. The class must have a constructor that takes a name as an argument, 
    but initializes all variables except the address.



*/

    String name, address, color;
    int age, weight;
    char sex;
    
    public Cat(int weight,String color, String address){
        this.weight = weight;
        this.age = 12;
        this.sex = 'c';
        this.color = color;
        this.address = address;
    }
    
    
    public Cat(int weight, String color){
        this.age = 12;
        this.weight = weight;
        this.sex = 'c';
        this.color = color;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.sex = 'c';
        this.color = "black";
    }
    
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = 'c';
        this.color = "black";
    }
    
    public Cat(String name){
        this.name = name;
        this.age = 12;
        this.weight = 4;
        this.sex = 'c';
        this.color = "black";
    }
    public static void main(String[] args) {

    }
}
