import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try{
                System.out.println("------------------------------------\n" +
                        "    Please select operation:\n" +
                        "\t1- C   to  F\n" +
                        "\t2- F   to  C\n" +
                        "   SELECT ANY OTHER NUMBER TO QUIT\n");
                double num;
                switch (input.nextShort()) {
                    case 1:
                        num = takeNum();
                        displayNum(num, (num * 9 / 5.0 + 32));
                        break;
                    case 2:
                        num = takeNum();
                        displayNum(num, ((num - 32) * 5 / 9.0));
                        break;
                    default:
                        flag = false;
                }
            }
            catch(InputMismatchException e){
                System.err.println("Error: Input is of an incorrect datatype!");
                input.nextLine();
            }
        }

    }
    static double takeNum() throws InputMismatchException {
        System.out.print("Please insert number: ");
        return new Scanner(System.in).nextDouble();
    }

    static void displayNum(double source, double conv){
        System.out.printf("%.2f\t->\t%.2f\n", source, conv);
    }
}