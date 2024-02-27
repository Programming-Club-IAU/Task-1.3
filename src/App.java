import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option=0; double temp, result;
        System.out.println("Welcome to our Temperature Converter program!");
        while(option!=3){
            System.out.print("\nChoose an option:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Exit\n\nEnter your option:");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter the temperature in Celsius:");
                    temp = sc.nextDouble();
                    result = (temp*9/5)+32;
                    System.out.println(" _______________________________________________");
                    System.out.println("(   )                                         /");
                    System.out.println(" | |    The temperature in Fahrenheit is:");
                    System.out.println(" | |\t\t"+result+"°F");
                    System.out.println("(___)_________________________________________\\");
                    break;
                case 2:
                    System.out.print("Enter the temperature in Fahrenheit:");
                    temp = sc.nextDouble();
                    result = (temp-32)*5/9;
                    System.out.println(" _______________________________________________");
                    System.out.println("(   )                                         /");
                    System.out.println(" | |    The temperature in Celsius is:");
                    System.out.println(" | |\t\t"+result+"°C");
                    System.out.println("(___)_________________________________________\\");
                    break;
                case 3:
                    System.out.println(" _______________________________________________");
                    System.out.println("(   )                                         /");
                    System.out.println(" | |\tIt was a pleasure to serve you.");
                    System.out.println(" | |\t\t Goodbye 0v0!");
                    System.out.println("(___)_________________________________________\\");
                    break;
                default:        
                System.out.println(" (\\__/)");
                System.out.println(" ( -.-)\tInvalid option. Please try again.");
                System.out.println("@(\")(\")");
            }
        }
    }
}
