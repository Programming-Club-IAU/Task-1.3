import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
          
            System.out.println("\nTemperature Conversion Program");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (1, 2, or 0): ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 0).");
                scanner.nextLine(); 
                continue;
            }

            
            if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }
            double temperature;
            while (true) {
                try {
                    System.out.print("Enter temperature to convert: ");
                    temperature = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); 
                }
            }

            
            char conversionType = choice == 1 ? 'C' : 'F';

            
            double convertedTemperature = convertTemperature(temperature, conversionType);
            System.out.printf("The converted temperature is: %.2f\n", convertedTemperature);
        }

    
        scanner.close(); 
    }

    public static double convertTemperature(double temperature, char conversionType) {
        if (conversionType == 'C') {
            return (temperature * 9/5) + 32;
        } else if (conversionType == 'F') {
            return (temperature - 32) * 5/9;
        } else {
            System.out.println("Invalid conversion type. Please enter 'C' or 'F'.");
            return Double.NaN; 
        }
    }
}
