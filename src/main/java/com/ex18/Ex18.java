/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex18;
import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        String celsius, fahrenheit;
        String choice;
        celsius = "C";
        fahrenheit = "F";

        //Menu
        System.out.print("---Welcome to Temperature Converter 1.0---\n");
        System.out.print("Press C to convert from Fahrenheit to Celsius\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit\n");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.print("         Enter a choice (C or F): ");
        choice = scan.nextLine();

        //Celsius conversion menu and calculation
        if(choice.equalsIgnoreCase(celsius)) {

            System.out.println("");
            System.out.println("Your choice: C");

            double celsiusIn;

            Scanner scan2 = new Scanner(System.in);
            System.out.print("Please enter temperature in Fahrenheit: ");
            celsiusIn = scan2.nextDouble();

            double celsiusCalc = (celsiusIn - 32) * 5 / 9;

            System.out.print("The temperature in Celsius: " + celsiusCalc);

        }

        //Fahrenheit conversion menu and calculation
        if(choice.equalsIgnoreCase(fahrenheit)) {

            System.out.println("");
            System.out.println("Your choice: F");

            double fahrenheitIn;

            Scanner scan3 = new Scanner(System.in);
            System.out.print("Please enter temperature in Celsius: ");
            fahrenheitIn = scan3.nextDouble();

            double fahrenheitCalc = (fahrenheitIn * 9 / 5) + 32;

            System.out.print("The temperature in Fahrenheit: " + fahrenheitCalc);

        }

    }

}
