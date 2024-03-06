package TemperatureConverters;

import java.util.*;

public class TemperatureConverters {

    public static void main(String[] args) {

        boolean isReady = true;
        int choice;
        double temperature;
        double fahrenheit;
        double celsius;
        
                
        final String Thermometer = " "
                + "      ______________________"
            + "\r\n     |   ^F     _    ^C     |"
            + "\r\n     |  100  - |{0}| -  40  |"
            + "\r\n     |   90  - |{1}| -  30  |"
            + "\r\n     |   80  - |{2}| -  25  |"
            + "\r\n     |   70  - |{3}| -  20  |"
            + "\r\n     |   60  - |{4}| -  15  |"
            + "\r\n     |   50  - |{5}| -  10  |"
            + "\r\n     |   40  - |{6}| -   5  |"
            + "\r\n     |   30  - |{7}| -   0  |"
            + "\r\n     |   20  - |{8}| -  -5  |"
            + "\r\n     |   10  - |{9}| - -10  |"
            + "\r\n     |    0  - |{10}| - -20 |"
            + "\r\n     |  -10  - |{11}| - -25 |"
            + "\r\n     |  -20  - |{12}| - -30 |"
            + "\r\n     |  -30  - |{13}| - -35 |"
            + "\r\n     |         '***`        |"
            + "\r\n     |       (*****)        |"
            + "\r\n     |        `---'         |"
            + "\r\n     |______________________|";
        String[] thermometerArray = Thermometer.split("\\r");



       
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("* Temperature Converter *");
        System.out.println("****************************");

        while (isReady) {
            System.out.println("Choose the conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Please enter a number.");
                sc.next(); // Discard the invalid input
                continue;
            }
            System.out.println("""
                               --------------------------------------------
                               --------------------------------------------""");
            
            choice = sc.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice! Please try again.");
            System.out.println("""
                               --------------------------------------------
                               --------------------------------------------""");                
                continue;
            }

            if (choice == 3) {
                
                System.out.println("Goodbye! Thank you for using the Temperature Converter.");
                isReady = false;
                continue;
            }

            System.out.println("Enter the temperature to be converted:");
           
            if (!sc.hasNextDouble() && !sc.hasNextInt()) {
                   System.out.println("Invalid temperature! Please enter a valid number.");
                   sc.next(); // Discard the invalid input
                   continue;
                }
            temperature = sc.nextDouble();

            if (temperature < -273.15) {
                System.out.println("Temperature cannot be less than -273.15 degrees!");
                continue;
            }
           

            if (choice == 1) {
                 fahrenheit = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", temperature, fahrenheit);
                for (String line : thermometerArray) {
                 System.out.println(line);
               }    

                System.out.println("""
                               ----------------------------------------------------------------------------------------
                               ----------------------------------------------------------------------------------------""");


            } else {
                 celsius = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n", temperature, celsius);
                for (String line : thermometerArray) {
                 System.out.println(line);
               }                 
                System.out.println("""
                               ----------------------------------------------------------------------------------------
                               ----------------------------------------------------------------------------------------""");
            }
        }

        sc.close();
        
                System.out.println("     ________________________________________________");
        System.out.println("            /                                                \\");
        System.out.println("           |    _________________________________________     |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |  C:\\> _ TASK 3                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |            Sponsored by:                |    |");  
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |               Programming               |    |");
        System.out.println("           |   |                  Club                   |    |");
        System.out.println("           |   |               Development               |    |");
        System.out.println("           |   |                   Unit                  |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |                                         |    |");
        System.out.println("           |   |_________________________________________|    |");
        System.out.println("           |                                                  |");
        System.out.println("           \\_________________________________________________/");
        System.out.println("                   \\___________________________________/");
        System.out.println("                ___________________________________________");
        System.out.println("             _-' .- .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_");
        System.out.println("          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_");
        System.out.println("       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_");
        System.out.println("    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_");
        System.out.println(" _-'.-.-.-.-.-. .---.-. .-------------------------. .-.---. .---.-.-.-.`-_");
        System.out.println(":-------------------------------------------------------------------------:");
        System.out.println("`---._.-------------------------------------------------------------._.---'");

    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
