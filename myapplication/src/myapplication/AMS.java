package myapplication;

import java.util.Scanner;

//Airport Management System

public class AMS {
	static AMSobj ob;
	
	public static AMSobj enterData(AMSobj ob1 ) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("\nEnter Number of Entries : ");
		int N = s.nextInt();
		
		ob1 = new AMSobj(N);
		
		for (int i=0; i<N; i++) {
			s.nextLine();
			System.out.print("Enter Flight Name : ");
			String flightName = s.nextLine();
			System.out.print("Enter Airline Name : ");
			String airline = s.nextLine();
			System.out.print("Enter Flight Model : ");
			String flightModel = s.nextLine();
			
			ob1.setObj(flightName, airline, flightModel);
		}
		s.close();
		return ob1;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("\t\t\t\t\t AMS Application\n");
				
		while (true){
			System.out.println("\n\t1. Enter Data");
			System.out.println("\t2. Display Details");
			System.out.println("\t3. Search");
			System.out.println("\t4. Exit");
			
			System.out.print("\nEnter your choice : ");
			int choice = s.nextInt();
			
			if (choice == 4) {
				System.out.println("Thank you!!!");
				break;
			}
			
			switch (choice){
				case 1:
					ob = enterData(ob);
					break;
					
				case 2:
					if (ob == null) {
						System.out.println("Data not found.");
					}else {
						ob.display();
					}
					break;
					
				case 3:
					if (ob == null) {
						System.out.println("Data not found.");
					}else {
						System.out.print("\nEnter your flightId : ");
						s.nextLine();
						String flightId = s.nextLine();
						ob.search(flightId);
					}
			}
		}
		s.close();
		
	}

}
