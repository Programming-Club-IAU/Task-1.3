import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double temp,converted_temp;
        int choice;
        boolean continueP=true;
        while (continueP) {
            try{
            System.out.println("=====================================================");
            System.out.println("Choose a service from the following:\n1- covert from Celsius to Fahrenheit\n2- convert from Fahrenheit to Celsius\n3- exit");
            choice=input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter temperature in Celsius");
                    temp=input.nextDouble();
                    converted_temp=(temp * 9/5) + 32;
                    System.out.println(temp+" °C equals to "+converted_temp+"°F");
                    break;
            
                case 2:
                    System.out.println("enter temperature in Fahrenheit");
                    temp=input.nextDouble();
                    converted_temp=(temp - 32) * 5/9;
                    System.out.println(temp+" °F equals to "+converted_temp+"°C");
                    break;
            
                case 3:
                    continueP=false;
                    System.out.println("bye bye ~~");
                    break;
            
                default:
                System.out.println("please enter a number from the list.");
                    break;
            }
        }
        catch(java.util.InputMismatchException p){
            System.out.println("please enter a valid number");
            main(args);
        }
    }
    input.close();
    }
}

