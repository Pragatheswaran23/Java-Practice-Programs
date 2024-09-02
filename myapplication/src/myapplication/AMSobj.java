package myapplication;

public class AMSobj {
	
	int len;
	AMSdata [] arr;
	
	AMSobj(){}
	
	AMSobj(int len){
		this.len = len;
		arr = new AMSdata[len];
	}
	
	int i = 0;
	
	void setObj(String flightName, String airlineName, String flightModel) {
		
		if (i < len) {
			String flightId = "AWSID" + i + 1;
			arr[i++] = new AMSdata(flightName, flightId, airlineName, flightModel);
		}else {
			System.out.println("Data Overflow!!!");
		}
		
	}
	
	void display() {
		System.out.println("\n=======================================================================\n");
		for (AMSdata a : arr) {
			System.out.println("Flight Id : " + a.getFlightId());
			System.out.println("Flight Name : " + a.getFlightName());
			System.out.println("Airline Name : " + a.getAirlineName());
			System.out.println("Flight Model : " + a.getFlightModel());
			System.out.println("\n=======================================================================\n");
		}
	}
	
	void search(String flightId) {
		System.out.println("\n=======================================================================\n");
		for (AMSdata a : arr) {
			if ((a.getFlightId()).equals(flightId)) {
				System.out.println("Flight Id : " + a.getFlightId());
				System.out.println("Flight Name : " + a.getFlightName());
				System.out.println("Airline Name : " + a.getAirlineName());
				System.out.println("Flight Model : " + a.getFlightModel());
				System.out.println("\n=======================================================================\n");
			}
		}
		
	}

}
