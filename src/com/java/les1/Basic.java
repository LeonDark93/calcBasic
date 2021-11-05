package com.java.les1;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        /**  ------------------------------------------------------------------
         * sayHello();
         * System.out.println("Sum = " + sum(56, 78));
         * System.out.println("Subtraction = " + subtraction(90.9,67.9));
         * System.out.println("Multiplication = " + multiplication(89,90));
         * System.out.println("Division = " + division(67,0));
         -------------------------------------------------------------------*/
        getYourBirthDate(23,2021);

    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        if (num2 == 0) {
            num2 = 1;
        }
        return num1 / num2;
    }

    public static void getYourBirthDate(int age, int year) {
        Scanner inAge = new Scanner(System.in);
        System.out.println("Enter your age please");
        System.out.println("For example age =  ...56...");
        System.out.println("Age = ");
        age = inAge.nextInt();
        year = 2021;
        int birth_date = year - age;
        System.out.println("Your BirthDate = " + birth_date);


    }
}