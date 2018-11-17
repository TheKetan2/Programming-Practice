package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;
    public String name;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        if(this.age>anotherCat.age && this.weight>anotherCat.weight && this.strength>anotherCat.strength)
        {
            return true;
        }
        else
        {
        return false;
        }
        
    }

    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.age = 4;
        cat1.weight = 24;
        cat1.strength = 99;
        cat2.age = 3;
        cat2.weight = 23;
        cat2.strength = 98;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
