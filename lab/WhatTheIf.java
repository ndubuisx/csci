/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 4 - WhatTheIf.java
 *  October 04, 2018
 
 
 *  Compilation:  javac WhatTheIf.java
 *  Execution:    java WhatTheIf
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class WhatTheIf {

    // main method
    public static void main(String[] args) {
        //////// Mountain Climber ////////

        // assign the elevation variable to 0
        int elevation = 0;

        // create scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // prompt user to input integer 
        // assign user input to elevation
        System.out.println("What is your elevation? ");
        elevation = input.nextInt();

        // if statement to determine what output to print
        if(elevation > 26000){
            System.out.println("Death Zone!");
        }else if(elevation > 7000){
            System.out.println("High!");
        }else{
            System.out.println("Meh, not that high!");
        }

        //////// Magic 8 Ball ////////

        // initialize number variable
        int number = 0;

        // prompt user to input number between 1 and 1000
        // assign user input to number 
        System.out.println("Now enter a number between 1 and 1000: ");
        number = input.nextInt();

        // if statement to determine what output to print
        if(number > 750){
            System.out.println("Great!");
        }else if(number > 500){
            System.out.println("Good!");
        }else if(number > 250){
            System.out.println("Average!");
        }else{
            System.out.println("Poor!");
        }

        //////// Calculation ////////

        // initialize yards variable 
        int yards = 0;
        // initialize feet variable 
        int feet = 0;
        // initialize inches variable 
        int inches = 0;

        // prompt user for some number of yards
        // assign user input to yards variable 
        System.out.println("Enter some number of yards: ");
        yards = input.nextInt();

        // convert value for yards to feet
        feet = yards * 3;
        // convert value for yards to inches
        inches = yards * 36;

        // print result of calculation
        System.out.println("This is equivalent to " + feet + " feet or " + inches + " inches.");

    }

}