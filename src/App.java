import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("===========Welcome To Temprture Converter Program===========");
        int choice=0;
        double fah,cel;
        int answare;
        while (choice!=3){
            System.out.print("Enter Your Choice\n1-Convert Celsius To Fahrenheit\n2-Convert Fahrenheit To Celsius\n3-Exit The Program\n>");
            choice=input.nextInt();
            if(choice==1){
                System.out.print("Enter The Tempreture In Celsius: ");
                cel=input.nextDouble();
                fah=cel*(9/5.0)+32.0;
                System.out.println("The Tempreture "+cel+" In Celsius Is Equalivent To "+fah+" In Fahrenheit");
                System.out.println("=======================================================");
            }
            else if(choice==2){
                System.out.print("Enter The Tempreture In Fahrenheit: ");
                fah=input.nextDouble();
                cel=fah*(5/9.0)-32.0;
                System.out.println("The Tempreture "+fah+" In Fahrenheit Is Equalivent To "+cel+" In Celsius");
                System.out.println("=======================================================");
            }
            else if(choice==3){
                break;
            }
            else{
                System.out.print("Are You Trying To Exit?\n1=Yes\t2=No\n>");
                choice=input.nextInt();
                if(choice==2){
                    System.out.print("Please Enter The Right Choice Again");
                    System.out.println("\n=======================================================");
                }
                if(choice==1)
                    break;
            }
        }
        System.out.println("=======================================================");
        System.out.println("   Thank You For Using My Program\n\tPlease Rate Later\n");
    }
}
