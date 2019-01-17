/****************************************************************************** 
 * Lab 1 - Take Average
 * 
 * Prints average of three numbers from user inputs
 * Author: Emmanuel Ndubuisi
 * Date: January 16, 2019
 * 
 * Compilation:  javac average.java
 * Execution:    java average
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner;
// class declaration
class average {
  // main method
  public static void main(String[] args){
    // create scanner object to read input 
    Scanner input = new Scanner(System.in);
    // initialize number variables to temporary input 0
    int num_1 = 0;
    int num_2 = 0;
    int num_3 = 0;
    // initialize sum and average 
    int sum = 0;
    int average = 0;
    
    // prompt user for first integer
    System.out.print("Enter first integer");
    // assign user input to num_1
    num_1 = input.nextInt();
    // prompt user for second integer
    System.out.print("Enter second integer");
    // assign user input to num_2
    num_2 = input.nextInt();
    // prompt user for third integer
    System.out.print("Enter third integer");
    // assign user input to num_3
    num_3 = input.nextInt();
    
    // assign the sum of all integers to the sum variable
    sum = num_1 + num_2 + num_3;
    // divide the sum by 3 and assign to the average variable
    average = sum/3;
    
    // print result
    System.out.println(average);
  }
}