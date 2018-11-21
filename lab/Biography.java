/******************************************************************************
 *
 *  Emmanuel Ndubuisi
 *  CSCI 206 - 1L
 *  Lab 10 - Biography.java
 *  November 20, 2018
 
 
 *  Compilation:  javac Biography.java
 *  Execution:    java Biography
 *
 ******************************************************************************/

// import scanner class from the java.util package
import java.util.Scanner; 

public class Biography {

    // main method
    public static void main(String[] args) {
        // create scanner object to read input
        Scanner input = new Scanner(System.in);
        // initiliaze variables required for program
        String name = "";
        int age = 0;
        char gender;
        String hometown = "";
        String school = "";
        String major = "";
        String music = "";

        // extra four variables
        int birthday = 0;
        String relationship = "";
        String language = "";
        String email = "";

        // stores title (Ms, Mr, Mx)
        String title = "";

        // prompt user for input 
        System.out.println("Please enter your first and last name: ");
        // assign user input to name
        name = input.nextLine();
        // prompt user for input 
        System.out.println("How old are you? ");
        // assign user input to age
        age = input.nextInt();
        input.nextLine();
        // prompt user for input 
        System.out.println("Where are you from? ");
        // assign user input to hometown
        hometown = input.nextLine();
        // prompt user for input 
        System.out.println("What school do you go to? ");
        // assign user input to school
        school = input.nextLine();
        // prompt user for input 
        System.out.println("What is your major? ");
        // assign user input to major
        major = input.nextLine();
        // prompt user for input 
        System.out.println("What kind of music do you listen to? ");
        // assign user input to music
        music = input.nextLine();
        // prompt user for input 
        System.out.println("What year were you born in? ");
        // assign user input to birthday
        birthday = input.nextInt();
        input.nextLine();
        // prompt user for input 
        System.out.println("What is your relationship status? ");
        // assign user input to relationship
        relationship = input.nextLine();
        // prompt user for input 
        System.out.println("What language do you speak? ");
        // assign user input to language
        language = input.nextLine();
        // prompt user for input 
        System.out.println("What is your email address? ");
        // assign user input to email
        email = input.nextLine();
        // prompt user for input 
        System.out.println("Please enter a letter form your gender: ");
        // assing user input to gender
        gender = input.next().charAt(0);

        // intiliaze variable to store first and last name
        String first_name = "";
        String last_name = "";

        // check equivalent title for gender input
        switch(gender){
            // when gender char is 'f'
            case 'f':
                title = "Ms";
                break;
            // when gender char is 'm'
            case 'm':
                title = "Mr";
                break;
            // default option
            default:
                title = "Mx";
        }

        // if name contains a space
        // if there are two names (first and last name) in the name string 
        if(name.indexOf(' ') != -1){
            // first name is from the beginning of the string to the space
            first_name = name.substring(0, name.indexOf(' '));
            // last name is from the char after the space to the end of the string
            last_name = name.substring(name.indexOf(' ') + 1, name.length());
            // if first name is longer than last name 
            if(first_name.length() > last_name.length()){
                // print statement
                System.out.println("\n" + first_name + " is longer than " + last_name);
            // if first name and last name have the length
            }else if (first_name.length() == last_name.length()){ 
                // print statement
                System.out.println("\n" + first_name + " has the same length as " + last_name);
            // if first name is shorter than the last name
            }else{
                // print statement
                System.out.println("\n" + first_name + " is shorter than " + last_name);
            }
        }else{
            // when there is only one name in the name string (when no space is present)
            // assign name to first name
            first_name = name;
            // assign name to last name
            last_name = name;
            // print statement
            System.out.println("\n" +name + " is longer than ");
        }

        // print result with user inputs (biography)
        System.out.println("\n*****************************************************");
        System.out.println("Here is the bio for " + name);
        System.out.println(name + " is " + age + " and from " + hometown + ".");
        System.out.println(title + " " + first_name + " is currently majoring in " + major + " at " + school + ".");
        System.out.println(title + " " + first_name + " enjoys listening to " + music + " and is " + relationship + ".");
        System.out.println(title + " " + first_name + " speaks " + language + " and was born " + birthday + ".");
        System.out.println(title + " " + first_name + "\'s email address is " + email + ".");
        System.out.println("*****************************************************");

    }

}