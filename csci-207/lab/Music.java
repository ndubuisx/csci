/****************************************************************************** 
 * Lab 2 - Music
 * 
 * Prints random songs from array
 * Author: Emmanuel Ndubuisi
 * Date: January 28, 2019
 * 
 * Compilation:  javac Music.java
 * Execution:    java Music
 ******************************************************************************/

public class Music{
  public static void main(String[] args){
    // array of songs
    String[] songs = {"Sunflower","Without Me", "Thank U, Next", "Sicko Mode", "High Hopes", 
                       "Happier", "Girls Like You", "Drip Too Hard", "Eastside", "Zeze", "Wow", 
                       "Wake Up in the Sky", "Better Now", "Mo Bamba", "Breathin"};
    // generate random numbers
    int randInt = (int)Math.floor(Math.random() * songs.length);
    // loops to print 10 times
    for(int i=0; i<10; i++){
      // while the value at the current index is not null
      // while the song hasn't been printed previously
      while(songs[randInt] == null){
        // change the index
        randInt = (int)Math.floor(Math.random() * songs.length);
      }
      // print the song
      System.out.println(songs[randInt]);
      // assign the value at the array to null
      songs[randInt] = null;
      // get new random number
      randInt = (int)Math.floor(Math.random() * songs.length);
    }
  }
}
