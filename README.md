# Level 1.3: Temperature Converter (Java)

## Table of Contents

- [Overview](#overview)
- [Learning Objectives](#learning-objectives)
- [Setup and Tutorial](#setup-and-tutorial)
- [Project Overview](#project-overview)
- [Submission Guidelines](#submission-guidelines)



## overview

This Java program converts temperatures between Celsius and Fahrenheit. It repeatedly prompts the user to choose the conversion type and input a temperature, then performs the conversion and displays the result. The program continues until the user chooses to exit.

## learning-objectives

1.Implementing User Input: Gain experience in prompting users for input and reading input from the console using Java.

2.Conditional Statements: Learn how to use conditional statements such as if-else or switch cases to make decisions in the program based on user input.

3.Looping Constructs: Understand how to implement loops to allow the program to perform multiple conversions until the user chooses to exit.

4.Variable Manipulation: Practice working with variables to store and manipulate temperature values during the conversion process.

5.Algorithmic Thinking: Develop problem-solving skills by devising an algorithm to convert temperatures accurately based on the chosen conversion type.

6.Graceful Program Exit: Learn how to implement a mechanism for the user to exit the program smoothly when they are finished using it.


## setup-and-tutorial

### 1. Setup

#### 1.1 Java Development Kit (JDK)

Make sure you have Java Development Kit (JDK) installed on your system. You can download and install JDK from the official Oracle website: [Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)

#### 1.2 Integrated Development Environment (IDE)

Choose an Integrated Development Environment (IDE) for Java development. Some popular options include:
- [visual studio code](https://code.visualstudio.com)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

Download and install the IDE of your choice.

### 2. Tutorial

#### 2.1 Java Basics

If you're new to Java programming, it's essential to understand the basics of the language. You can find numerous tutorials and resources online to learn Java. Here are some key topics to cover:
- Java syntax: variables, data types, operators, etc.
- Input/output using `System.out.println` and `Scanner` class.
- Control flow statements: if-else, switch-case, loops.

#### 2.2 Temperature Conversion Algorithm

Before diving into coding, plan the algorithm for temperature conversion. Break down the task into smaller steps:
- Prompt the user to choose the conversion type.
- Based on the choice, prompt for the temperature to be converted.
- Perform the conversion and display the result.
- Implement a loop to repeat the process until the user chooses to exit.
- Here is an example of how to use the `while` Loop.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a number (or 'exit' to quit): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Goodbye!");
        scanner.close();
    }
}
}
```

#### 2.3 Coding the Temperature Converter

Start coding the Temperature Converter project in your chosen IDE:
- Create a new Java project.
- Implement the main logic of the program:
  - Implement a loop for repeated conversions.
  - Use conditional statements to determine the conversion type.
  - Prompt the user for input using the `Scanner` class.
  - Perform the conversion based on the chosen type.
  - Display the result.
  - Provide an option for the user to exit gracefully.
- Test the program with various inputs to ensure it functions correctly.


#### 2.4 Documentation and Sharing

Document your code with comments to explain the functionality of each part. Create a README.md file to provide instructions on how to use the program and include any necessary setup steps. Share your project with others in the programming club for feedback and collaboration.


## How to Use

1. Run the Java program.
2. Choose the conversion type:
    - Celsius to Fahrenheit
    - Fahrenheit to Celsius
    - Exit
3. Enter the temperature to be converted.
4. The program will display the converted temperature.
5. Repeat steps 2-4 for multiple conversions.
6. To exit the program, choose the "Exit" option.

## Project Overview:

### Description

This Java project focuses on creating a Temperature Converter program that allows users to convert temperatures between Celsius and Fahrenheit. The program interacts with users through the console, prompting them to choose the conversion type and input a temperature. It then performs the conversion and displays the result. The program continues to run until the user chooses to exit.

### Requirements

1. **Loop Implementation:**
   - Implement a loop to enable users to perform multiple temperature conversions without restarting the program.

2. **Conditional Statements:**
   - Use conditional statements (if-else or switch cases) to determine the conversion type based on user input.

3. **Conversion Options:**
   - Provide options for users to choose between Celsius to Fahrenheit conversion and Fahrenheit to Celsius conversion.

4. **User Input:**
   - Prompt the user to input the temperature to be converted.

5. **Conversion Logic:**
   - Implement the conversion logic based on the chosen type (Celsius to Fahrenheit or Fahrenheit to Celsius).

6. **Display Result:**
   - Display the converted temperature to the user.

7. **Graceful Program Exit:**
   - Allow users to exit the program gracefully when they choose to stop.

### Example Interaction
Temperature Converter

Choose conversion type:

Celsius to Fahrenheit
Fahrenheit to Celsius
Exit
Enter your choice: 1
Enter the temperature in Celsius: 25
25.0°C is equal to 77.0°F

Choose conversion type:

Celsius to Fahrenheit
Fahrenheit to Celsius
Exit
Enter your choice: 2
Enter the temperature in Fahrenheit: 98.6
98.6°F is equal to 37.0°C

Choose conversion type:

Celsius to Fahrenheit
Fahrenheit to Celsius
Exit
Enter your choice: 3
Exiting the program. Goodbye!

### Bonus

- Enhance the user interface with ASCII art or additional messages for a more engaging experience.
- Implement error handling to manage unexpected inputs gracefully.


## Submission Guidelines

- The app should be pushed to Github and a pull request should be created. You can check how to push your code to Github in section [2.1.2 Add Changes](https://github.com/Programming-Club-IAU/git-and-github#212-add-changes).
- The pull request title should be in the following format: `<your-name> - <project-name>`. You can check how to make a pull request in section [2.1.5. Create a pull request](ttps://github.com/Programming-Club-IAU/git-and-github#215-create-a-pull-request).
- The pull request description should contain the following:
  - A description of your project.
  - A screenshot of the app.