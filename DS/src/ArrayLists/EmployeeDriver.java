package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(new Employee("D", "ID004"));
		al.add(new Employee("A", "ID001"));
		al.add(new Employee("C", "ID003"));
		al.add(new Employee("B", "ID002"));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
