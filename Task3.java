import java.util.Scanner;
import java.util.InputMismatchException;
public class Task3{
      public static void main(String[] args){
      Scanner scan= new Scanner(System.in);
      char Convert;
      double Num;
      double temperature;

  
      
      while (true){
        try{
        
        temperature = 0;
       System.out.println("Enter your Value  or  0 for exit :");
       Num = scan.nextDouble();
        
        

       if (Num == 0 ){
        break;
       }
        
      
      
       System.out.println("Convertion From Fahrenheit to Celsius (C) or Celsius Fahrenheit (F) ? ");
        Convert = scan.next().charAt(0);
        
        if (Convert == 'C') {
       
        temperature = (Num - 32) * 5/9 ;
        System.out.println(temperature+"C");
        }

        else if (Convert== 'F'){
            temperature= (Num * 9/5)+32;
            System.out.println(temperature+"F");

        }
        }
      
         catch(InputMismatchException e ){
          System.out.println("Wrong input");
          scan.nextLine();
        }
      }
      
      
      

    
}
}