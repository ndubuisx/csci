// todo: clean up code
import java.util.Scanner;

class Movie {
	String title;
	String rating;
	int duration;
	String[] showtimes;
	int numTickets;
	double totalearned = 0;
	
	public Movie(String t, String r, int d, String[] s){
		title = t;
		rating = r;
		duration = d;
		showtimes = s;
		numTickets = 0;
	}
	
	public void updateTickets(){
		numTickets++;
		totalearned = totalearned + moneyEarned();
		System.out.printf("Ticket purchased for %s", title);
	}
	
  public void display(){
    System.out.printf("%s, %s, %d, %s | %s | %s | %s \n", title, rating, duration, showtimes[0], showtimes[1], showtimes[2], showtimes[3]);
  }

	public double moneyEarned(){
		System.out.println(numTickets * 15.0);
		return numTickets * 50;
	}
	
	public void movieInfo(){
		System.out.println(title + "ticket sales: " + numTickets +"," + totalearned);
	}
}

public class MovieTest{
	public static void main(String[] args){
		String[] times1 = {"11", "12", "5", "740"};
		String[] times2 = {"120", "410", "710", "950"};
		String[] times3 = {"10", "12", "8", "940"};
		String[] times4 = {"11", "2", "755", "104"};
		String[] times5 = {"10", "1230", "540", "740"};
	
	  Scanner input = new Scanner(System.in);
	
    Movie movie1 = new Movie("Predator", "R", 100, times1);
    Movie movie2 = new Movie("House with...", "PG", 105, times2);
    Movie movie3 = new Movie("Life itself", "R", 100, times3);
    Movie movie4 = new Movie("Christopher Robin", "PG", 104, times4);
    Movie movie5 = new Movie("Unbroken", "PG13", 98, times5);
    
    Movie[] allmovies = {movie1, movie2, movie3, movie4, movie5};
    
    loop: while(true){
      System.out.println("\nEnter input:");
      int user_in = input.nextInt();
      switch(user_in){
        case 1:
          movie1.updateTickets();
          break;
        case 2:
          movie2.updateTickets();
          break;
        case 3:
          movie3.updateTickets();
          break;
        case 4:
          movie4.updateTickets();
          break;
        case 5:
          movie5.updateTickets();
          break;
        case 6:
          for(Movie mov:allmovies){
            mov.display();
          }
          break;
        case 7:
          for(Movie mov:allmovies){
            System.out.printf("%s: %d ticket(s), %.1f dollars \n", mov.title, mov.numTickets, mov.totalearned);
          }
          break loop;
          
      }
    }

  }
}
