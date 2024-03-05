import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("Choose temperature conversion type:\n1. Celsius to Fahrenheit (Type 'C')\n2. Fahrenheit to Celsius (Type 'F') ");
            System.out.println("Type 'exit' to exit the program");

            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("C")) {
                System.out.println("Enter temperature in Celsius:");

                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (choice.equalsIgnoreCase("F")) {
                System.out.println("Enter temperature in Fahrenheit:");

                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;

                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("You're exiting the program. See you soon!");
                break;
            } else {
                System.out.println("Please try again :)");
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}

