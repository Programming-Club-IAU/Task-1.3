import java.util.Scanner;

public class TempConv {
    public static void main(String[] args){
        

        // ASCII Art and instructions
        System.out.println(" _        _______               _________ _  ______             _________ _       ");
        System.out.println("( (    /|(  ___  )|\\     /|     \\__   __/( )(  __  \\   |\\     /|\\__   __/( (    /|");
        System.out.println("|  \\  ( || (   ) || )   ( |        ) (   |/ | (  \\  )  | )   ( |   ) (   |  \\  ( |");
        System.out.println("|   \\ | || (___) || (___) |        | |      | |   ) |  | | _ | |   | |   |   \\ | |");
        System.out.println("| (\\ \\) ||  ___  ||  ___  |        | |      | |   | |  | |( )| |   | |   | (\\ \\) |");
        System.out.println("| | \\   || (   ) || (   ) |        | |      | |   ) |  | || || |   | |   | | \\   |");
        System.out.println("| )  \\  || )   ( || )   ( | _   ___) (___   | (__/  )  | () () |___) (___| )  \\  |");
        System.out.println("|/    )_)|/     \\||/     \\|( )  \\_______/   (______/   (_______)\\_______/|/    )_)");
        System.out.println("                           |/                                                      ");
        


        while(true){
            try{
                System.out.println("\nPlease select an option:");
                System.out.println("1 - Convert Celsius to Fahrenheit");
                System.out.println("2 - Convert Fahrenheit to Celsius");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter temp in c");
                        System.out.println("Result : " + (input.nextDouble() * 9 / 5 + 32));
                        break;
                    case 2:
                        System.out.println("Enter temp in f");
                        System.out.println("Result : " + ((input.nextDouble() - 32) * 5 / 9));
                }
                System.err.println("Done !");
            }
            catch(Exception e){
                System.out.println("Something went wrong :( \nplease try again");
            }
            
        }
        
    }
}
