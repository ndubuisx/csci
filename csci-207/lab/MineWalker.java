import java.util.*;
// todo: add comments
class Main {
  // instance variables
  public static char[][] field = new char[5][10];
  // pos_x = row index, pos_y = column index
  public static int pos_x, pos_y = 0;
  // check if player lost
  public static boolean lose = false;

  public static void startGame(){
    // fill board with '_'
    for(int i=0; i<5; i++){
      for(int j=0; j<10; j++){
        field[i][j] = '_';
      }
    }

    // set player and ice cream position
    field[pos_x][pos_y] = 'O';
    field[4][9] = 'V';

    // generate random mines
    for(int k=0; k<3; k++){
      int random_x = (int) Math.floor(Math.random() * 5);
      int random_y = (int) Math.floor(Math.random() * 10);

      // only generate mine on empty space '_'
      if(field[random_x][random_y] == '_'){
        field[random_x][random_y] = 'X';
      }else{
        k--;
      }
    }

    // print board
    printBoard();
  }

  // if player position is at (4, 9) then player wins!
  public static boolean checkForWin(){
    if(field[4][9] == '0'){
      return true;
    }
    return false;
  }

  // if player lands on mine then player loses
  public static boolean checkForLose(int pos_x, int pos_y){
    if(field[pos_x][pos_y] == 'X'){
      return true;
    }else{
      return false;
    }
  }

  // print instruction
  public static void instructions(){
    System.out.println("Press 1 to go one space up");
    System.out.println("Press -1 to go one space down");
    System.out.println("Press -2 to go one space left");
    System.out.println("Press 2 to go one space right");

    System.out.println("--------------------------------");
  }

  public static void play(int control){
    switch(control){
      case 1:
        // handle ArrayIndexOutOfBoundsException
        try{
          // empty current position
          field[pos_x][pos_y] = '_';
          // checkForLose()
          if(checkForLose((pos_x-1), pos_y)){
            lose = checkForLose((pos_x-1), pos_y);
          }else{
            // set player new position
            field[(--pos_x)][pos_y] = '0';
          }
        }catch(ArrayIndexOutOfBoundsException exception){
          lose = true;
        }
        break;
      case -1:
        // handle ArrayIndexOutOfBoundsException
        try{
          // empty current position
          field[pos_x][pos_y] = '_';
          // checkForLose()
          if(checkForLose((pos_x+1), pos_y)){
            lose = checkForLose((pos_x+1), pos_y);
          }else{
            // set player new position
            field[(++pos_x)][pos_y] = '0';
          }
          break;
        }catch(ArrayIndexOutOfBoundsException exception){
          lose = true;
        }
      case 2:
        // handle ArrayIndexOutOfBoundsException
        try{
          // empty current position
          field[pos_x][pos_y] = '_';
          // checkForLose()
          if(checkForLose(pos_x, (pos_y-1))){
            lose = checkForLose(pos_x, (pos_y-1));
          }else{
            // set player new position
            field[pos_x][(--pos_y)] = '0';
          }
          break;
        }catch(ArrayIndexOutOfBoundsException exception){
          lose = true;
        }
      case -2:
        // handle ArrayIndexOutOfBoundsException
        try{
          // empty current position
          field[pos_x][pos_y] = '_';
          // checkForLose()
          if(checkForLose(pos_x, (pos_y+1))){
            lose = checkForLose(pos_x, (pos_y+1));
          }else{
            // set player new position
            field[pos_x][(++pos_y)] = '0';
          }
          break;
        }catch(ArrayIndexOutOfBoundsException exception){
          lose = true;
        }
      default:
        System.out.println("Can't understand your input. Check instructions!");
    }
    
    if(!lose) {
      printBoard();
    }
  }

  public static void printBoard(){
    System.out.println();
    // print board (mine)
    for(int m=0; m<5; m++){
      for(int n=0; n<10; n++){
        System.out.printf("%s ", field[m][n]);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int control = 0;
    // print instructions
    instructions();
    // start game
    startGame();
    // while player hasn't lost nor won
    while(!checkForWin() && !lose){
      System.out.print("Make your move: ");

      // handle InputMismatchException
      try{
        control = input.nextInt();
        // quit game if control == 9
        if(control == 9){
          System.out.println("Thanks for playing!");
          break;
        }
        // make player move
        play(control);
      }catch(InputMismatchException exception){
        // return error
        System.out.println("You can only enter numbers. Try again!");
        // print board
        printBoard();
      }
      // clear input buffer
      input.nextLine();
      System.out.println();

      // check for win/lose
      if(checkForWin()){
        System.out.println("You win!");
      }
      if(lose){
        System.out.println("You lose!");
      }
    }
    // close input
    input.close();
  }
}
