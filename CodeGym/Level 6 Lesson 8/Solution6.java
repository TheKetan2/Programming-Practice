package com.codegym.task.task06.task0605;


import java.io.*;

/* 
Controlling body weight

*/
/*
Requirements:
1. The calculateBMI method should display text on the screen.
2. The calculateBMI method should display "Underweight: BMI < 18.5" if the 
body mass index is less than 18.5.
3. The calculateBMI method should display "Normal: 18.5 <= BMI < 24.9" if the 
body mass index is between 18.5 and 24.9.
4. The calculateBMI method should display "Overweight: 25 <= BMI < 29.9" if the 
body mass index is between 25 and 29.9.
5. The calculateBMI method should display "Obese: BMI >= 30" if the 
body mass index is 30 or more*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // write your code here
            double bmi = weight/(height*height);
            if(bmi < 18.5)
                System.out.println("Underweight: BMI < 18.5");
            else if(bmi >=18.5 && bmi <24.9)
                System.out.println("Normal: 18.5 <= BMI < 24.9");
            else if(bmi>=25 && bmi<29.9)
                System.out.println("Overweight: 25 <= BMI < 29.9");
            else if(bmi>=30)
                System.out.println("Obese: BMI >= 30");
        }
    }
}
