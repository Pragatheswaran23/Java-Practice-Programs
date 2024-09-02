package flight;
import java.util.Scanner;

public class BookTiicket {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Flight f1 = new Flight(1);
		while (true) {
			System.out.println("Flight Ticket resevation system : ");
			System.out.println("\t1. Book Ticket");
			System.out.println("\t2. Cancel Ticket");
			System.out.println("\t3. View Details");
			System.out.println("\t4. Exit");
			System.out.print("\nEnter your choice : ");
			int choice = s.nextInt();
			s.nextLine();
			if (choice == 4) break;
			switch (choice){
				case 1:{
					System.out.println("Available Tickets : " + f1.tickets);
					
					f1.bookTicket(5, "abcd");
					break;
				}
				case 2:{
					f1.cancleTicket(1);
					break;
				}
				case 3:{
					f1.display();
				}
			}
			
		}
	}

}
