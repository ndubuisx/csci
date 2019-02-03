// todo: add comments
import java.util.Scanner;

public class LetterCounter {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String word = input.nextLine();
    System.out.println("Enter a letter: ");
    char letter = input.next().charAt(0);
    int count = 0;

    for(int i=0; i< word.length(); i++){
      if(word.charAt(i) == letter){
        count++;
      }
    }

    System.out.printf("There are %d instances of the letter '%s' in the word \"%s\"", count, letter, word);
  }
}
