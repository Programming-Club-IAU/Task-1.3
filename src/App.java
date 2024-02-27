import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option=0; double temp, result;
        System.out.println("Welcome to our Temperature Converter program!");
        while(option!=3){
            System.out.println("Choose an option:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Exit\n\nEnter your option:");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter the temperature in Celsius:");
                    temp = nextDouble();
                    result = (temp*9/5)+32;
                    System.out.println("The temperature in Fahrenheit is: "+result);
                    break;
                case2:
                    System.out.print("Enter the temperature in Fahrenheit:");
                    temp = nextDouble();
                    result = (temp-32)*5/9;
                    System.out.println("The temperature in Celsius is: "+result);
                    break;
                case3:
                    System.out.println("It was a pleasure to serve you. Goodbye 0v0!");
                    break;

        }
    }
}
