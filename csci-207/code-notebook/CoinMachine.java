/**----------------------------------------------------------------------------
 * Prompt a user for a positive number of cents and convert to 
 * dollars, quarters, dimes, nickels, and pennies.
 *
 * @author Emmanuel Ndubuisi 
 * @version jan 15, 2019
 */

// todo: add comments
import java.util.Scanner;
class CoinMachine {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cents = 0;

    int quarter, dime, nickel = 0; // penny = final value of rem

    cents = input.nextInt();
    int rem = cents; // rem = remainder

    quarter = cents/25;
    rem = cents % 25;
   
    dime = rem/10;
    rem = rem % 10;

    nickel = rem/5;
    rem = rem % 5;

    System.out.printf("%d Quarters, %d Dimes, %d Nickels, %d Pennies", quarter, dime, nickel, rem);
  }
}