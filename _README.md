`Temperature Conversion Program`
This program is designed to convert temperatures between Fahrenheit and Celsius. The need for such a conversion arises because different regions and scientific disciplines use different temperature scales. Fahrenheit is commonly used in the United States, while Celsius is used in most other countries and in the scientific community worldwide.

To convert temperatures from Fahrenheit to Celsius and vice versa, you can use the following equations:

## 1- From Fahrenheit to Celsius:
**C = ( F - 32 ) * 5/9**
Where:
C is the temperature in Celsius.
F is the temperature in Fahrenheit.
------------------------------------------

## 2- From Celsius to Fahrenheit:
**F = (C * 9)/5 + 32**
Where:
C is the temperature in Celsius.
F is the temperature in Fahrenheit.
-------------------------------------------

These equations allow you to easily convert temperatures between the Celsius and Fahrenheit systems.


```Scanner Class for Input```
We use the Scanner class to read user input from the console. This choice is motivated by Scanner's ability to parse primitive types and strings using regular expressions, making it more versatile for reading different types of input.

**Scanner scanner = new Scanner(System.in);**
```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        
        while (true) {
            System.out.print("Enter a number (or '0' to quit): ");
            input = scanner.nextInt();

            if (input == 0) {
                break;
            }
            // Additional processing can be added here if the input is not 0 
        }
        // "Goodbye!" should be printed after the user exits the loop
        System.out.println("Goodbye!");
        scanner.close();
    }
}
```