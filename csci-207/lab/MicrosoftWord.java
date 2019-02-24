/****************************************************************************** 
 * Lab 4 - MicrosoftWord
 * 
 * This program prompts user for a string and an action to perform on the string.
 * The appropriate method is then called on the string.
 * Author: Emmanuel Ndubuisi
 * Date: February 22, 2019
 * 
 * Compilation:  javac MicrosoftWord.java
 * Execution:    java MicrosoftWord
 ******************************************************************************/

import java.util.Scanner;
import java.util.regex.*;

public class MicrosoftWord {
  public static int f1(String str){
    // regex for word characters
    String pattern = "[\\w-]+";

    // create pattern object
    Pattern r = Pattern.compile(pattern);
    // create matcher object
    Matcher m = r.matcher(str);
    // keep track of word count
    int count = 0;

    while(m.find()) {
      // increase counter when word is found
      count++;
    }
    return count;
  }

  public static int f2(String str){
    // return length of string (character count)
    return str.length(); 
  }

  public static String f3(String str){
    // convert the first letter of the first word to uppercase
    // return result
    return Character.toString(Character.toUpperCase(str.charAt(0))) + str.substring(1);
  }

  public static String f4(String str){
    // return string to lowercase
    return str.toLowerCase();
  }

  public static String f5(String str){
    // return string to lowercase
    return str.toUpperCase();
  }

  public static String f6(String str){
    String sentence_case = "";
    sentence_case = Character.toString(Character.toUpperCase(str.charAt(0)));

    // loop through string 
    for(int i=1; i<str.length(); i++){
      if(str.charAt(i-1) == ' '){
        // convert to uppercase if preceeding character was a space
        sentence_case += Character.toString(Character.toUpperCase(str.charAt(i)));
      }else{
        // concatenate parameter character to new string
        sentence_case += Character.toString(str.charAt(i));
      }
    }
    return sentence_case;
  }

  public static String f7(String str){
    String swapcase = "";
    // loop through str
    for(int i=0; i<str.length(); i++){
      // if char at index i is uppercase
      if(str.charAt(i) == Character.toUpperCase(str.charAt(i))){
        // concatenate lowercase char to swapcase string
        swapcase += Character.toString(Character.toLowerCase(str.charAt(i)));
      // if char at index i is lowercase
      }else if(str.charAt(i) == Character.toLowerCase(str.charAt(i))){
        // concatenate lowercase char to swapcase string
        swapcase += Character.toString(Character.toUpperCase(str.charAt(i)));
      }
    }
    return swapcase;
  }

  public static void main(String[] args) {
    // create scanner object
    Scanner input = new Scanner(System.in);
    
    // prompt user for input
    System.out.print("Enter a string: ");
    // assign user input to string_input variable
    String string_input = input.nextLine();

    // prompt user for input
    System.out.print("Enter an action: ");
    // assign user input to user_action variable
    String user_action = input.nextLine();
    System.out.println();
    // ignore case
    user_action = user_action.toUpperCase();

    // call appropriate method depending on user input
    switch(user_action){
      case "F1":
        System.out.printf("Word count: %d \n", f1(string_input));
        break;
      case "F2":
        System.out.printf("Character count: %d \n", f2(string_input));
        break;
      case "F3":
        System.out.printf("Sentence Case: %s \n", f3(string_input));
        break;
      case "F4":
        System.out.printf("Lowercase: %s \n", f4(string_input));
        break;
      case "F5":
        System.out.printf("Uppercase: %s \n", f5(string_input));
        break;
      case "F6":
        System.out.printf("Capitalize: %s \n", f6(string_input));
        break;
      case "F7":
        System.out.printf("Swap case: %s \n", f7(string_input));
        break;
      default:
        System.out.println("Cannot understand your input. Please try again");
    }

    input.close();
  }
}
