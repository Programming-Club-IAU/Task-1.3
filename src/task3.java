import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int input;
       float oldTemperature;
       float newTemperature ;

        while (true) {
            System.out.print("\nEnter\n\"1\" to convert from Fahrenheit to Celsius \n\"2\" to convert from Celsius to Fahrenheit\n\"3\" to exit or quit\n --> ");
            input = scanner.nextInt();
            

            if (input == 1) {
                System.out.println( "Enter the temperature in Fahrenheit: ");
                oldTemperature = scanner.nextFloat();
                newTemperature = (oldTemperature- 32)*5/9;
                System.out.println(oldTemperature+"°F equals "+ newTemperature + "°C");
            }


            else if (input == 2) {
                System.out.println("Enter the temperature in Celsius: ");
                oldTemperature = scanner.nextInt();
                newTemperature = (oldTemperature)*9/5 + 32;
                System.out.println(oldTemperature+"°C equals "+ newTemperature + "°F ");
            }



            else if (input == 3) {
                System.out.println("Hope you had great time\nGoodbye!");
                break;
            }

            else
            {
                System.out.println("you Enter a wrong number try again!!\n");
            }

    }
    scanner.close();
}
}
