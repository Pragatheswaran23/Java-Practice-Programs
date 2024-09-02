package Programs;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Student [] s = new Student[5];
		
		s[0] = new Student("Prathin", "AI001", 100);
		s[1] = new Student("Pragatheswaran", "AI002", 100);
		s[2] = new Student("Sanjay", "AI003", 100);
		s[3] = new Student("Monish", "AI004", 100);
		s[4] = new Student("Vishva", "AI005", 100);
		
		for (int i = 0 ; i < 5 ; i++ ) {
			System.out.println(s[i]);
			System.out.println("\n===================================================\n");
		}
		
	}

}
