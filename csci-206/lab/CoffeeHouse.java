/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 7 - CoffeeHouse.java
 *  October 25, 2018
 
 
 *  Compilation:  javac CoffeeHouse.java
 *  Execution:    java CoffeeHouse
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class CoffeeHouse {

    // main method
    public static void main(String[] args) {
        // create roast_option variable
        // this will store the user roast option (either 1, 2 or 3)
        int roast_option = 0;

        // create flavor_option variable 
        // this will store the user flavor option (either 1, 2 or 3)
        int flavor_option = 0;
        
        // create roast_selected variable
        // this will store what roast the user selected
        String roast_selected = "";

        // create flavor_selected variable
        // this will store what flavor the user selected
        String flavor_selected = "";

        // this variable checks if the user option (roast_option or flavor_option) is valid or not (true or false)
        boolean checker = true;

        // create scanner object to collect user input
        Scanner input = new Scanner(System.in);

        // print welcome message
        System.out.println("Welcome to my Coffee House");

        // ask user to select corresponding option for the roast they want
        System.out.println("What type of roast would you like?");
        System.out.print("Enter 1 for dark roast, 2 for light roast, or 3 for espresso: ");
        // collect user input and assign input to roast_option variable
        roast_option = input.nextInt();

        // prompt user to select corresponding option for the flavor they want
        System.out.println("What type of flavor would you like?");
        System.out.print("Enter 1 for mocha, 2 for vanilla, or 3 for hazelnut: ");

        // collect useer input and assign input to flavor_option variable
        flavor_option = input.nextInt();

        // switch statement
        // this matches user option (roast_option) to the corresponding roast
        switch(roast_option){
            // when roast_option is 1
            case 1:
                // assign roast_selected to dark roast
                roast_selected = "dark roast";
                break;
            // when roast_option is 2
            case 2:
                // assign roast_selected to light roast
                roast_selected = "light roast";
                break;
            // when roast_option is 3
            case 3:
                // assign roast_selected to Espresso
                roast_selected = "espresso";
                break;
            // when roast_option is not 1, 2 or 3
            default:
                // this will assign checker to false signifying that the user input is not valid
                checker = false;
        }
        
        // switch statement        
        // this matches user option (flavor_option) to the corresponding flavor
        switch(flavor_option){
            // when flavor_option is 1
            case 1:
                // assign flavor_selected to mocha
                flavor_selected = "mocha";
                break;
            // when flavor_option is 2
            case 2:
                // assign flavor_selected to vanilla
                flavor_selected = "vanilla";
                break;
            // when flavor_option is 2
            case 3:
                // assign flavor_selected to hazelnut
                flavor_selected = "hazelnut";
                break;
            // when flavor_option is not 1, 2 or 3
            default:
                // this will assign checker to false signifying that the user input is not valid
                checker = false;
        }

        // this checks if the options (flavor_option and roast_option) selected were valid (either 1, 2 or 3)
        if(checker){
            // print the order if the options were valid (true)
            System.out.println("Your " + roast_selected + " coffee with " + flavor_selected + " is ready!");
            System.out.println("Thanks for coming!");
        }else{
            // print error message if the options were not valid (false)
            System.out.println("Sorry, your order does not seem right!");
            System.out.println("Please try again...");
            System.out.println("Thanks for coming!");
        }
    }
}