package ArrayLists;

import java.util.ArrayList;

public class BookDriver {
	
	public static void main(String[] args) {
		
		ArrayList<Book> al = new ArrayList();
		
		al.add(new Book("The intelligent investor", "Benjamin Graham", 499.99));
		al.add(new Book("Harry Potter", "JK rowlings",80));
		al.add(new Book("Java", "Dixit Sir", 120));
				
		for (int i=0; i<al.size(); i++) {
			Book book = al.get(i);
			if (book.prize > 100) {
				al.remove(book);
			}
		}
		System.out.println(al);
		
//		for (Book b : al) {
//			if (b.prize > 100) {
//				al.remove(b);
//			}
//		}
//		System.out.println(al);
		
	}

}
