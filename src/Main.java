import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String temperature;
        int choice = 0;
        double fahrenheit, celsius;

        System.out.println("Welcome to the Temperature Convertor program \n");
        

        while (true) {

            System.out.println("\n------------------------------");
            System.out.println("\nChoose the conversion type: \n 1-Celsius to Fahrenheit \n 2-Fahrenheit to Celsius \n 3-Exit \n");
            
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }

            if (choice == 3) {
                break;
            }
            else if (choice < 1 || choice > 3) {
                System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                System.out.println("Please enter a valid number!");
                continue;
            }
            else {
                System.out.println("\n------------------------------");
                System.out.print("Enter the temperature number: ");
                temperature = scanner.next();

                try {
                    double temp = Double.valueOf(temperature);

                    switch (choice) {
                        case 1:
                            fahrenheit = (temp * (9.0 / 5)) + 32;
                            System.out.println("\nThe temperature in Fahrenheit: " + fahrenheit);
                            break;
                        case 2:
                            celsius = (temp - 32) * (5.0 / 9);
                            System.out.println("The temperature in Celsius: " + celsius);
                            break;
                        default:
                            System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
                            System.out.println("Please enter a valid number!");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number for the temperature!");
                }
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("\nGoodbye!");

        
    }
}
