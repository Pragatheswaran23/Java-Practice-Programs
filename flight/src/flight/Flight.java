package flight;
import java.util.ArrayList;

public class Flight {
	
	int tickets;
	int price;
	int flightName;
	
	Flight(){}
	
	Flight(int flightName){
		this.flightName = flightName;
		this.tickets = 50;
		this.price = 5000;
	}
	
	ArrayList<Integer> passengerIds = new ArrayList();
	ArrayList<String> passengerNames = new ArrayList();
	ArrayList<Integer> ticketcounts = new ArrayList();
	ArrayList<Integer> prices = new ArrayList();
	
	int id = 1;
	
	public void bookTicket(int ticketcount,String passengerName) {
		if ((tickets-ticketcount) >= 0) {
			passengerIds.add(id++);
			passengerNames.add(passengerName);
			ticketcounts.add(ticketcount);
			prices.add(ticketcount*this.price);
			this.price += 200;
			this.tickets -= ticketcount;
			System.out.println("Ticket Successfully Booked");
		}else {
			System.out.println(ticketcount + " tickets not available");
		}
	}
	
	public void cancleTicket(int ticketId) {
		if (passengerIds.contains(ticketId)) {
			this.price -= 200;
			this.tickets += ticketcounts.get(ticketId);
			passengerIds.remove(ticketId);
			passengerNames.remove(ticketId);
			ticketcounts.remove(ticketId);
			prices.remove(ticketId);
			System.out.println("Ticket cancelled...");
		}else {
			System.out.println("Id not found.");
		}
	}
	
	
	public void display() {
		System.out.println("Flight Name : " + flightName + "\n");
		for (int i = 0; i<passengerIds.size(); i++) {
			System.out.println("Passenger Ids :" + passengerIds.get(i) + "Passenger Name :" + passengerNames.get(i) + "Tickets Booked :" + ticketcounts.get(i) + "\n");
		}
	}

}
