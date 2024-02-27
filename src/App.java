import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    
        int choice;

        do{
            System.out.println("\n\nTemperature Converter\n");
            System.out.println("Choose conversion type:\n");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice: ");        
        

            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        celsiusToFahrenheit();
                        break;
                    case 2:
                        fahrenheitToCelsius();
                        break;
                    case 3:
                        System.out.println("Exiting... \n\n End of Program\n\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Only a Numuric Value Allowed, Please Try Again \n");
                sc.next(); 
                choice = 0;
                
            }
        } while (choice != 3);

        sc.close();
        
    }
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");

        try {
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("------- "+celsius + "°C is equal to " + fahrenheit + "°F -------\n");
        } catch (InputMismatchException e) {
            System.out.println("Only a Numuric Value Allowed, Please Try Again.\n");
            scanner.next();
        }
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");

        try {
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("------- "+fahrenheit + "°F is equal to " + celsius + "°C -------\n");
        } catch (InputMismatchException e) {
            System.out.println("Only a Numuric Value Allowed, Please Try Again.\n");
            scanner.next();
        }
    }

}

