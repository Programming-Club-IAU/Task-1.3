;import java.util.Scanner;

public class ranpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Temperature Converter");
 while (true) { 
System.out.print(" \n Choose conversion type:\n 1. Celsius to Fahrenheit\n 2. Fahrenheit to Celsius\n 3. Exit\n Enter your choice: ");

choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the temperature: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "C is equal to " + fahrenheit + "F\n");
            } else if (choice == 2) {
                System.out.print("Enter the temperature: ");
                double fahrenheitInput = scanner.nextDouble();
                double celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
                System.out.println(fahrenheitInput + "F is equal to " + celsiusOutput + "C\n");
            } else if (choice == 3) {
                System.out.println("Well, thanks for using me. Goodbye!");
                break;
            } else {
                System.out.println("Is it that hard to choose a number!? Here's another chance.\n");
            }
        }

        scanner.close();
    }
}
