/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class BMIcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your height in inches?");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int height = input.nextInt();

        System.out.print("What is your weight in pounds?");
        while (!input.hasNextInt()) {
            input.nextLine();
        }
        int weight = input.nextInt();

        double BMI = weight * 703 / (height * height);

        System.out.printf("Your BMI is %.2f.", BMI);
        if (BMI > 18.5 && BMI < 25){
            System.out.print("\nYou are within the ideal weight range.");
        }
        else{
            System.out.print("\nYou are overweight. You should see your doctor.");
        }

    }
}