import java.util.Scanner;

class FahToCel {

    public static void main(String[] args) {
        double c=0,f=0;
        Scanner scan = new Scanner(System.in);
        
        int result = -1;
        
        while(result != 0) {
            System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2) or Enter zero To Exit: ");
            result = scan.nextInt();

            if(result==1) {
                System.out.println("Enter Temperature in Fahrenheit: "); 
                f = scan.nextDouble();
                c = (f-32)*(5.0/9);
                System.out.println("Temperature in Celsius is: " + c);
            } else if(result==2) {
                System.out.println("Enter Temperature in Celsius: "); 
                c = scan.nextDouble();
                f = (c * ( 9.0/5 ))+ 32 ;
                System.out.println("Temperature in Fahrenheit is: " + f); 
            } else if(result==0) {
                System.out.println("Exiting...");
            } 
        }

        scan.close();
    }
}
