import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("******************************************");
            System.out.println("******     Temperature Converter     *****");
            System.out.println("******************************************\n"); 
            System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3 Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            System.out.print("Enter the temperature: ");
            double temperature = scanner.nextDouble();
            
            if (choice == 1) {
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "C is equal to " + fahrenheit + 'F');
            } else if (choice == 2) {
                double celsius = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "F is equal to " + celsius + 'C');
            } else {
                System.out.println("Invalid choice. Please enter a valid option.\n");
            }
        }
        
        scanner.close();
    }
}
