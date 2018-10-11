/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 5 - LoopyNumbers.java
 *  October 11, 2018
 
 
 *  Compilation:  javac LoopyNumbers.java
 *  Execution:    java LoopyNumbers
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class LoopyNumbers {
    
    // main method
    public static void main(String[] args) {
        // initialize start variable
        int start = 0;
        // initialize end variable        
        int end = 0;
        // initialize increment variable
        int increment = 0;

        // create scanner object to read input
        Scanner input = new Scanner(System.in);

        // prompt user to input integer
        System.out.println("Please enter starting number: ");
        // assign user input to start variable
        start = input.nextInt();
        // prompt user to input another integer
        System.out.println("Please enter ending number: ");
        // assign input to end variable
        end = input.nextInt();
        // prompt user to input another integer
        System.out.println("Please enter increment number: ");
        // assign user input to increment variable
        increment = input.nextInt();

        while(start <= end){
            // run while start is less than end 
            if(start % 2 == 0){
                System.out.println("The number " + start + " is even");
            }else{
                System.out.println("The number " + start + " is odd");
            }
            // increment start with the increment value
            start+= increment;
        }

        // print statement when the while loop has finished running
        System.out.println("Thanks for playing!");
    }
}