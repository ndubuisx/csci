/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 8 - AddingItUp.java
 *  November 01, 2018
 
 
 *  Compilation:  javac AddingItUp.java
 *  Execution:    java AddingItUp
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class Main {

    // main method
    public static void main(String[] args) {
        // create scanner object
        // this scanner object will be used in both part one and two
        Scanner input = new Scanner(System.in);
        
        /****** PART ONE ******/
        // create num variable and assign 0 to it 
        // stores each number the user inputs
        int num = 0;
        // create sum variable and assign 0 to it 
        // stores the sum of all the numbers the user input
        int sum = 0;
        
        // loop runs 6 times
        for(int i=1; i<=6; i++){
            // prompt user for input
            System.out.println("Please enter a number: ");
            // assign user input to num
            num = input.nextInt();
            // increment sum by the value of num
            sum+=num;
        }

        // print result 
        System.out.println("The sum of your number is " + sum);

        /****** PART TWO ******/
        
        // create price variable and assign 0 to it
        // this stores individual price
        double price = 0;
        // create total_price variable and assign 0 to it
        // this stores total price
        double total_price = 0;
        // create change variable and assign 0 to it
        // this calculates how much the user has left
        double change = 0;

        // loop runs 5 times
        for(int j=1; j<=5; j++){
            // prompt user for input
            System.out.println("Please enter a price");
            // assign user input to price
            price = input.nextDouble();

            // if the price the user inputs plus the total_price is less than or equals to 20.00
            if(price + total_price <= 20.00){
                // increment total_price by price
                total_price += price;
            }else{
                // calculate how much is left out of 20.00
                change = 20.00 - total_price;
                // while the price is less than the change
                while(price > change){
                    // prompt user to input another price
                    System.out.println("That item is too expensive");
                    System.out.println("You have only $" + change + " left");
                    System.out.println("Enter a price less than or equal to $" + change);
                    System.out.println("Please enter price: ");
                    // assign user input to price
                    price = input.nextDouble();
                    // if price is less than change (if user input valid price)
                    if(price <= change){
                        // increment total_price by price
                        total_price += price;
                        // jump to the next iteration of the loop
                        continue;
                    }
                }
            }
        }
        // print result
        System.out.println("Your items total $" + total_price + " Good job!");
    }
}