package Basic_program;

public class Cars {
	
	private Tyre [] tyres = {
			new Tyre("Apollo"),
			new Tyre("MRF"),
			new Tyre("Apollo"),
			new Tyre("Mrf")
	};
	
	//getter
	Tyre[] getTyre() {
		return tyres;
	}

}
