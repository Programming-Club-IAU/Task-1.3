
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=1;

        while(true){

            System.out.println("** Enter the number of your choice **\n 1.celsius to Fahrenheit\n 2.Fahrenheit to selsius \n 3.Exit");
            int num=scanner.nextInt();


            


            if (num==1){
            System.out.println("Enter the temperature : ");
            int unit=scanner.nextInt();

            System.out.println("\n"+unit+" in celsius equal ("+((unit * 9/5) + 32)+") in Fahrenheit");
            }

            else if (num==2){

            System.out.println("Enter the temperature : ");
            int unit=scanner.nextInt();
            System.out.println("\n"+unit+" in Fahrenheit equal ("+((unit - 32) * 5/9)+") in celsius");
            }

            else if (num==3)
            {
                System.out.println("Thanks for using our system (:");
                break;}

            else
            {System.out.println("please Enter 1 , 2 or 3 only");
            continue;}

            while(true){
            System.out.println("______________________\n \n Do you want to convert something else ? \n 1.Yes\n 2.No");
            int x=scanner.nextInt();

            if (x==1){
              t=0;
              break;
              }
            else if (x==2){
              System.out.println("Good bye");
              break;}
            else{
              System.out.println("Please enter 1 or 2 only");
              continue;
            }
            }
            if (t==0)
            continue;
            break;


        }







        



    }



}
