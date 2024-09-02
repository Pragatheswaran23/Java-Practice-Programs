package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortBook {
	
	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList();
		
		al.add(new Book("The intelligent investor", "Benjamin Graham", 499.99));
		al.add(new Book("Harry Potter", "JK rowlings",80));
		al.add(new Book("Java", "Dixit Sir", 120));
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
