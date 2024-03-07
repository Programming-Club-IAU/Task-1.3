import java.util.Scanner;

public class task3AliAlzahrani {

    public static void main(String[] args){
  
       Scanner scanner = new Scanner(System.in);


       while(true){ 

        System.out.println("enter 1 to convert from fahrenheit to celsius ");
        System.out.println("enter 2 to convert from celsius to fahrenheit ");
        System.out.println("to stop the program enter 3");
        int converter = scanner.nextInt();
        
        

      if(converter==1){
            System.out.println("what is the value ?");
            double value =scanner.nextInt(); 
            value= value*1.8+32;
            System.out.println(value+" F");

              }
      else if(converter==2){
        System.out.println("what is the value ?");
        double value =scanner.nextInt(); 
        value= (value-32)/1.8;
        System.out.println(value+" C");
      }
      else if(converter==3){
        System.out.println("you stoped the program");
        break;
      }
    }

    }
    
}
