import java.util.Scanner;
// todo: add comments, handle exceptions
class MineWalker {
  // instance variables
  public static char[][] field = new char[5][10];
  public static int pos_x, pos_y = 0;
  public static boolean lose = false;

  public static void startGame(){
    for(int i=0; i<5; i++){
      for(int j=0; j<10; j++){
        field[i][j] = '_';
      }
    }

    field[pos_x][pos_y] = 'O';
    field[4][9] = 'V';

    // generate random mines
    for(int k=0; k<3; k++){
      int random_x = (int) Math.floor(Math.random() * 5);
      int random_y = (int) Math.floor(Math.random() * 10);

      boolean condition = field[random_x][random_y] == '_' && field[random_x][random_y] != 'O' && field[random_x][random_y] != 'V';

      if(condition){
        field[random_x][random_y] = 'X';
      }else{
        k--;
      }
    }
    printBoard();
  }

  public static boolean checkForWin(){
    if(field[4][9] == '0'){
      return true;
    }
    return false;
  }

  public static boolean checkForLose(int pos_x, int pos_y){
    if(field[pos_x][pos_y] == 'X'){
      return true;
    }else{
      return false;
    }
  }

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
        field[pos_x][pos_y] = '_';
        if(checkForLose((pos_x-1), pos_y)){
          lose = checkForLose((pos_x-1), pos_y);
        }else{
          field[(--pos_x)][pos_y] = '0';
        }
      case -1:
        field[pos_x][pos_y] = '_';
        if(checkForLose((pos_x+1), pos_y)){
          lose = checkForLose((pos_x+1), pos_y);
        }else{
          field[(++pos_x)][pos_y] = '0';
        }
        break;
      case 2:
        field[pos_x][pos_y] = '_';
        if(checkForLose(pos_x, (pos_y-1))){
          lose = checkForLose(pos_x, (pos_y-1));
        }else{
          field[pos_x][(--pos_y)] = '0';
        }
        break;
      case -2:
        field[pos_x][pos_y] = '_';
        if(checkForLose(pos_x, (pos_y+1))){
          lose = checkForLose(pos_x, (pos_y+1));
        }else{
          field[pos_x][(++pos_y)] = '0';
        }
        break;
    }
    printBoard();
  }

  public static void printBoard(){
    System.out.println();
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
    instructions();
    startGame();
    while(!checkForWin() && !lose){
      System.out.print("Make your move: ");
      control = input.nextInt();
      if(control == 9){
        System.out.println("Thanks for playing!");
        break;
      }
      play(control);
      if(checkForWin()){
        System.out.println("You win!");
      }
      if(lose){
        System.out.println("You lose!");
      }
    }
    input.close();
  }
}
