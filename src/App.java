import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter");
        int choice;

        while (true) {
            System.out.println("Celsius to Fahreneheit (type 1). \nFaherenehieit to Celsius (type 2).");
            System.out.println("type 0 to exit the program.");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the temperature: ");
                double cels =scanner.nextDouble();
                double fahr = (cels * 9/5) +32 ;
                System.out.println(cels + "C is equal to "+fahr+ "F");

            }else if (choice == 2) {
                System.out.println("Enter the temperature: ");
                double fahr2 =scanner.nextDouble();
                double cels2 = (fahr2 - 32) * 5/9 ;
                System.out.println(fahr2 + "F is equal to "+cels2+ "C");
            }else if (choice == 0) {
                System.out.println("Thanks. Goodbye");
                break;
            }else{
                System.out.println("Invalid input. Please try agin");
            }

        }

        scanner.close();
    }
}
