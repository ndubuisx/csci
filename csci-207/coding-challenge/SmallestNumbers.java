<<<<<<< HEAD:csci-207/coding-challenge/SmallestNumbers.java
/****************************************************************************** 
 * Coding Challenge 1 - Smallest Integers
 * 
 * Determine the two smallest integers from a set of user input integers
 * Author: Emmanuel Ndubuisi
 * Date: January 17, 2019
 * 
 * Compilation:  javac SmallestNumbers.java
 * Execution:    java SmallestNumbers
 ******************************************************************************/

// todo: add comment
=======
// todo: add question and comment 
>>>>>>> b57613ff8af0c7c3bf09e4f55edd03fc0026f323:csci-207/code-challenge/SmallestNumbers.java
import java.util.Scanner;
class SmallestNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int min_one = input.nextInt();
    System.out.print("Enter number: ");
    int min_two = input.nextInt();
    int num;

    for(int i=0; i<3; i++){
      System.out.print("Enter number: ");
      num = input.nextInt();
      if(min_one < min_two){
        if(num < min_two){
          min_two = num;
        }
      }else{
        if(num < min_one){
          min_one = num;
        }
      }
    }
    System.out.printf("%d and %d are the smallest numbers", min_one, min_two);
  }
}
