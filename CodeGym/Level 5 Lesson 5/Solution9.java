package com.codegym.task.task05.task0510;


public class Cat {
    
    
String name, address, color;
    
int age, weight;
    
//write your code here
    
public void initialize(int weight, String color, String address){
        
this.weight = weight;
        
this.color = color;
        
this.address = address;
        
this.age = 3;
    
}
    
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 3;
        
        
    }
    
    public void initialize(String name, int age){
        this.name = name;
         this.age = age;
         this.weight = 5; 
         this.color = "blue";
    }
    
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight; 
        this.age = age;
        this.color = "golden";
    }
    
    
    public void initialize(String name){
        this.name = name;
        this.color = "black";
        this.age = 2;
        this.weight = 5;
        
    }
    

    public static void main(String[] args) {

    }
}
