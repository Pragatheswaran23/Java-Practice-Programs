package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		al.add(3);
		al.add(1);
		al.add(10);
		al.add(0);
		System.out.println(al);
		
		//sorting
		Collections.sort(al);
		System.out.println(al);
		
	}

}
