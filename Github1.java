/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;
import java.util.Scanner;
/**
 *
 * @author SOADAD
 */
public class Github1 {
         static Scanner input = new Scanner(System.in);
         public static void menu()
    {
        System.out.println("\n********List*********"); 
        System.out.println("1- Celsius to Fahrenheit");
        System.out.println("2- Fahrenheit to Celsius");
        System.out.println("3- exit");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        do{
            menu();
        System.out.println("Enter your choice: ");
         choice = input.nextInt();
       
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the temperature in Celsius : ");
                    double celsius = input.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("%.1f°C is equal to %.1f°F\n", celsius, fahrenheit);
                    break;
                
                case 2:
                    System.out.println("Enter the temperature in Fahrenheit : ");
                    double fahrenheitInput = input.nextDouble();
                    double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);
                    System.out.printf("%.1f°F is equal to %.1f°C\n", fahrenheitInput, celsiusOutput);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
            
        }while(choice!=3);
    }
        public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

        public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
