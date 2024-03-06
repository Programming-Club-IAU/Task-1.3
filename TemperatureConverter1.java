//package sds;

import java.util.Scanner;

public class TemperatureConverter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Temperature Converter");
            System.out.println("Choose conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    celsiusToFahrenheit();
                    break;
                case 2:
                    fahrenheitToCelsius();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice ,try again.");
            }
        }
        scanner.close();
    }

    public static void celsiusToFahrenheit() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = cin.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf( celsius + "C  is equal to " +fahrenheit+"F");
        System.out.println();
    }

    public static void fahrenheitToCelsius() {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = cin.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf( fahrenheit  + "F  is equal to  " +celsius +"C" );
        System.out.println();
    }
}