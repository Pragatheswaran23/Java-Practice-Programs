package myapplication;

public class AMSdata {
	
	private String airlineName;
	
	private String flightName;
	
	private String flightId;
	
	private String flightModel;

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	
	AMSdata(){}
	
	AMSdata(String flightName, String flightId, String airlineName, String flightModel){
		setFlightName(flightName);
		setFlightId(flightId);
		setAirlineName(airlineName);
		setFlightModel(flightModel);
	}

}
