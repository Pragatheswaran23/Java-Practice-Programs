package Basic_program;

public class LazyCar {
	
	private Tyre[] tyres = new Tyre[4];
	
	//helper 
	int i = 0;
	void addTyre(Tyre tyre) {
		//validation
		if (i < tyres.length) {
			tyres[i++] = tyre;
		}
		else {
			System.out.println("Car can only have 4 tyres.");
		}
	}
	
	Tyre[] getTyres() {
		return tyres;
	}

}
