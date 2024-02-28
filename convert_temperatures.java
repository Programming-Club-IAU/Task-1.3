import java.util.Scanner;

public class convert_temperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean X = true;
        int input;
        Double Fahrenheit, Celsius;
        while (X) {
            System.out.println(
                    "---------------Welcome---------------\n" +
                            "1- Celsius to Fahrenheit\r\n" +
                            "2- Fahrenheit to Celsius\r\n" +
                            "3- Exit\n" +
                            "Enter your choice:\r");
            input = scanner.nextInt();
            switch (input) {
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    X = false;
                    break;
                case 2:
                    System.out.println("Enter the temperature in Fahrenheit: ");
                    Fahrenheit = scanner.nextDouble();
                    Celsius = (Fahrenheit - 32) * 5 / 9;
                    System.out.println(Fahrenheit + "°F is equal to " + Celsius + "°C");
                    break;
                case 1:
                    System.out.println("Enter the temperature in Celsius: ");
                    Celsius = scanner.nextDouble();
                    Fahrenheit = (Celsius * 9) / 5 + 32;
                    System.out.println(Celsius + "°C is equal to " + Fahrenheit + "°F");
                    break;
                default:
                    System.out.println("\t\t\n\n--- Input error ---\n\n");
            }
        }
        scanner.close();
    }
}
