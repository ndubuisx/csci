/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 9 - Beer.java
 *  November 04, 2018
 
 
 *  Compilation:  javac Beer.java
 *  Execution:    java Beer
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class Beer {
    
    // main method
    public static void main(String[] args) {
        // create scanner object
        // this reads user input
        Scanner input = new Scanner(System.in);
        
        // this variable storees the price of the beer, 5.00
        double beer_price = 5.00;
        // this variable stores the minimum age required to buy beer, 21
        int age = 21;

        // initialize the cash_amount variable
        double cash_amount = 0;
        // initialize the customer_age variable
        int customer_age = 0;

        // initialize the cash_deficit variable
        double cash_deficit = 0;
        // initialize the age_deficit variable
        int age_deficit = 0;

        // prompt user for input
        System.out.println("Please enter customer age: ");
        // assign user input to customer_age variable
        customer_age = input.nextInt();
        // prompt user for input
        System.out.println("Please enter cash amount: ");
        // assign user input to cash_amount
        cash_amount = input.nextDouble();

        // calculate the age left for customer to be able to buy beer
        // if age_deficit is 0 or a negative number then the customer is eligible to buy beer
        age_deficit = age - customer_age;

        // calculate cash amount left for customer to be able to buy beer
        // if the cash_deficit is 0 or a negative number then the customer is eligible to buy beer
        cash_deficit = beer_price - cash_amount;

        // if the age_deficit and cash_deficit is less than or equal to 0
        // then the customer is eligible to buy beer
        if(age_deficit <= 0 && cash_deficit <= 0){
            // print success message
            System.out.println("Congratulations, you can have some beer!");
            System.out.println("Thank you for your patronage");
        // if the age_deficit is greater than 0 AND the cash_deficit is less than or equals to 0
        // then the customer has enough cash but the customer_age is less than the required age
        }else if(age_deficit > 0 && cash_deficit <= 0){
            // print error meesage
            System.out.println("Sorry, come back in " + age_deficit + " years");
            System.out.println("Thank you for your patronage!");
        // if the cash_deficit is greater than 0 AND the age_deficit is less than or equals to 0
        // then the customer has the required age BUT customer does not have enough cash 
        }else if(cash_deficit > 0 && age_deficit <= 0){
            // print error message
            System.out.printf("Sorry, you need $%.2f more \n", cash_deficit);
            System.out.println("Thank you for your patronage!");
        // if the cash_deficit is greater than 0 AND the age_deficit greater than 0
        // then the customer is not the required age AND the customer does not have enough cash
        }else{
            // print error message
            System.out.println("No Beer for you!");
            System.out.printf("You need $%.2f more \n", cash_deficit);
            System.out.println("Come back with it in " + age_deficit + " years");
            System.out.println("Thank you for your patronage!");
        }
    }
}