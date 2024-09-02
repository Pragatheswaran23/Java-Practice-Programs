package ArrayLists;

public class Book implements Comparable {
	
	String title;
	String author;
	double prize;
	
	Book(){}
	
	public Book(String title, String author, double prize) {
		this.title = title;
		this.author = author;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", prize=" + prize + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Book b = (Book) o;
		
		if (this.prize<b.prize) return -1;
		else if(this.prize>b.prize) return 1;
		
		return 0;
	}
	
	
	
	

}
