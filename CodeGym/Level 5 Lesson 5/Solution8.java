package com.codegym.task.task05.task0508;

/* 
Getters and setters for the Person class

*/

public class Person {
    //write your code here
    
    public String name;
    public int age; 
    public char sex;
    public void setAge(int age){
        this.age = age;    
    }
    public int  getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;    
    }
    public String getName(){
        return this.name;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex(){
        return this.sex;
    }

    public static void main(String[] args) {

    }
}
