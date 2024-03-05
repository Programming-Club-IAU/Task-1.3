import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Display welcome message and ASCII art
        System.out.println("\nWelcome to the Temperature Converter!\n");
        System.out.println(
                "       .--.\n" +
                        "      /    \\\n" +
                        "     /      \\\n" +
                        "    /        \\\n" +
                        "   /          \\\n" +
                        "  /____________\\\n" +
                        "  |             |\n" +
                        "  |             |\n" +
                        "  |  °C | °F   |\n" +
                        "  |             |\n" +
                        "  |             |\n" +
                        "  |____________|\n"
        );

        while (!exit) {
            displayMenu();

            int choice = getChoice(scanner);

            if (choice == 1) {
                convertCelsiusToFahrenheit(scanner);
            } else if (choice == 2) {
                convertFahrenheitToCelsius(scanner);
            } else if (choice == 3) {
                exit = true;
                System.out.println("Thank you for using the Temperature Converter. See you again!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nChoose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number (1-3): ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        System.out.println("Successfully converted from Celsius to Fahrenheit.");
    }

    private static void convertFahrenheitToCelsius(Scanner scanner) {
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        System.out.println("Successfully converted from Fahrenheit to Celsius.");
    }
}
