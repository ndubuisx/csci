// todo: add comments
import java.util.Scanner;
public class TicTacToe{
  public static String[][] board = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};

  public static char play(String player, int row, int column){
    Scanner input = new Scanner(System.in);
    if(board[row][column] == "-"){
      board[row][column] = player;
      printBoard();
      return ' ';
    }else{
      while(true){
        System.out.println("You cannot play here! Choose another square");
        String player_ = player;
        System.out.println("What row do you want to play in? ");
        row = input.nextInt();
        System.out.println("What column do you want to play in? ");
        column = input.nextInt ();
        if(board[row][column] == "-"){
          board[row][column] = player_;
          printBoard();
          return ' ';
        }
      }
    }
  }
  
  public static boolean checkForWin(){
    return checkRow() || checkColumn() || checkDiagonal();
  }

  public static boolean checkRow(){
    for(int i=0; i<3; i++){
      if(board[i][0] != "-" && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
        return true;
      }
    }
    return false;
  }

  public static boolean checkColumn(){
    for(int i=0; i<3; i++){
      if(board[0][i] != "-" && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
        return true;
      }
    }
    return false;
  }

  public static boolean checkDiagonal(){
    return ((board[0][0] != "-" && board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] != "-" && board[0][2] == board[1][1] && board[1][1] == board[2][0]));
  }

  public static void printBoard(){
    System.out.printf(
    " %s | %s | %s \n---|---|--- \n %s | %s | %s \n---|---|--- \n %s | %s | %s \n", board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]);
  }
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num = 0;
    String[] players = {"X", "O"};
    String player = "";
    int row, column;

    for(int i=0; i<9; i++){
      if(!checkForWin()){
        if(num == 0){
          player = players[num];
          System.out.printf("Hello! You are %s \n", players[num]);
          System.out.println("What row do you want to play in? ");
          row = input.nextInt();
          System.out.println("What column do you want to play in? ");
          column = input.nextInt();
          play(player, row, column);
          num++;
        }else{
          player = players[num];
          System.out.printf("Hello! You are %s \n", players[num]);
          System.out.println("What row do you want to play in? ");
          row = input.nextInt();
          System.out.println("What column do you want to play in? ");
          column = input.nextInt();
          play(player, row, column);
          num--;
        }
      } else{
        System.out.printf("%s wins! \n", player);
        printBoard();
        break;
      }
    }

    if(!checkForWin()){
      System.out.println("It's a tie... Game over!");
    }else{
      System.out.printf("%s wins! \n", player);
    }
  }
}
