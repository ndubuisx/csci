/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 11 - Statistics.java
 *  November 24, 2018
 
 
 *  Compilation:  javac Statistics.java
 *  Execution:    java Statistics
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

// the Methods class contains the mean and std methods
class Methods{
    // mean method - returns the mean of five numbers
    public double mean(double num1, double num2, double num3, double num4, double num5){
        // initiliaze the sum variable
        // stores the sum of all the five numbers
        double sum = 0;
        // initiliaze the mean variable
        // stores the average (mean) of all the five numbers
        double mean = 0;

        // add up all numbers
        sum = num1 + num2 + num3 + num4 + num5;
        // average of the numbers
        mean = sum/5;

        // return the mean
        return mean;
    }

    // std method - returns the std of the five numbers
    public double std(double num1, double num2, double num3, double num4, double num5, double mean){
        // stores the standard deviation of the numbers
        double std = 0;
        // finds the sum of the square of all numbers minus the mean 
        std = Math.pow((num1 - mean), 2) + Math.pow((num2 - mean), 2) + Math.pow((num3 - mean), 2) + Math.pow((num4 - mean), 2) + Math.pow((num5 - mean), 2);
        // divide the previous result by 5
        std = std/5;
        // the square root of the previous result
        std = Math.sqrt(std);

        // return the standard deviation
        return std;
    }
}

// this Statistics class contains the main method
public class Statistics {

    // main method
    public static void main(String[] args) {
        // create scanner object to read input
        Scanner input = new Scanner(System.in);
        // create an object of the Methods class
        Methods meth = new Methods();
        
        // initiliaze input variables required for program
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;
        double num4 = 0;
        double num5 = 0;
        // initiliaze variable for storing the mean
        double mean = 0;
        // initiliaze variable for storing the standard deviation
        double std = 0;

        // prompt user for input 
        System.out.println("Please enter number 1: ");
        // assign user input to num1
        num1 = input.nextDouble();
        // prompt user for input 
        System.out.println("Please enter number 2: ");
        // assign user input to num2
        num2 = input.nextDouble();
        // prompt user for input 
        System.out.println("Please enter number 3: ");
        // assign user input to num3
        num3 = input.nextDouble();
        // prompt user for input 
        System.out.println("Please enter number 4: ");
        // assign user input to num4
        num4 = input.nextDouble();
        // prompt user for input 
        System.out.println("Please enter number 5: ");
        // assign user input to num5
        num5 = input.nextDouble();

        // invoke the mean method from the Methods class to find the mean of the inputs
        mean = meth.mean(num1, num2, num3, num4, num5);
        // invoke the std method from the Methods class to find the standard deviation of the inputs
        std = meth.std(num1, num2, num3, num4, num5, mean);

        // print the results
        System.out.printf("You entered: %.1f, %.1f, %.1f, %.1f, %.1f \n", num1, num2, num3, num4, num5);
        System.out.println("The average of these numbers is: " + mean);
        System.out.println("The standard deviation of these numbers is: " + std);
    }

}
