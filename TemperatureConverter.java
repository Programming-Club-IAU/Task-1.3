import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("Choose conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            char choicechar = scanner.next().charAt(0);
            int choice = Character.getNumericValue(choicechar);

            switch (choice) {
                case 1:
                    convertCtoF(scanner);
                    break;
                case 2:
                    convertFtoC(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void convertCtoF(Scanner scanner) {
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F\n");
    }

    private static void convertFtoC(Scanner scanner) {
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C\n");
    }
}
