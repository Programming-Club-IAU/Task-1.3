import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner Tem = new Scanner(System.in);
    

    System.out.println("Temperture conversion app \n\n How can I help you? :) : \n -Type 1 to converting Celsius to Fahrenheit \n -Type 2 to converting Fahrenheit to Celsius \n -Type 3 to Exit the app");
    while (true){
      int num = input.nextInt();
      if(num == 1){
        System.out.println("Enter the temperture: ");
        int tem = Tem.nextInt();
        int result = (tem*9/5)+32;
        System.out.println("Temperture in Fahrenheit is " + result);
        System.out.println("Need somthing else?");
      }
      else if(num == 2){
        System.out.println("Enter the temperture: ");
        int tem = Tem.nextInt();
        int result = (5 * (tem - 32)) / 9;
        System.out.println("Temperture in Celsius is " + result);
        System.out.println("Need somthing else?");
      }
      else if(num == 3){
        System.out.println("Thank you for using the app \n Goodbye!");
        break;
      }
      else{
        System.out.println("Please choose a number form the list");
      }
    }
  }
}