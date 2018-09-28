/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 3 - LabAverage.java
 *  September 25, 2018
 
 
 *  Compilation:  javac LabAverage.java
 *  Execution:    java LabAverage
 *  Prints user lab average and equivalent lab grade to the terminal
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class LabAverage {

    // main method
    public static void main(String[] args) {
        // initialization phase
        int grade1 = 0; // initialize grade one
        int grade2 = 0; // initialize grade two
        int grade3 = 0; // initialize grade three
        int grade4 = 0; // initialize grade four
        int grade5 = 0; // initialize grade five
        int lab_average = 0; // initialize lab average
        String lab_grade = ""; // initialize lab grade

        // create scanner object to read input
        Scanner input = new Scanner(System.in);

        // prompt user for test score
        // assign test scores to the appropriate variables
        System.out.println("What is your first grade? "); 
        grade1 = input.nextInt();
        System.out.println("What is your second grade? ");
        grade2 = input.nextInt();
        System.out.println("What is your third grade? ");
        grade3 = input.nextInt();
        System.out.println("What is your fourth grade? ");
        grade4 = input.nextInt();
        System.out.println("What is your fifth grade? ");
        grade5 = input.nextInt();

        // calculate lab average
        lab_average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;

        // determine lab grade from lab average 
        if(lab_average > 89){
            lab_grade = "A";
        }
        else if(lab_average > 84){
            lab_grade = "B+";
        }
        else if(lab_average > 79){
            lab_grade = "B";
        }
        else if(lab_average > 74){
            lab_grade = "C+";
        }
        else if(lab_average > 69){
            lab_grade = "C";
        }
        else if(lab_average > 64){
            lab_grade = "D+";
        }
        else if(lab_average > 59){
            lab_grade = "D";
        }
        else{
            lab_grade = "F";
        }

        // print the lab average to the terminal
        System.out.println("Your lab average is: " + lab_average);

        // print the lab grade to the terminal
        System.out.println("Your lab grade is: " + lab_grade);
    }

}