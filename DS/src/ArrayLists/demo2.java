package ArrayLists;

import java.util.ArrayList;

public class demo2 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.contains(20));
		
		al.clear();
		System.out.println(al);
	}

}
