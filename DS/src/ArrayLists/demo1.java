package ArrayLists;
import java.util.*;
public class demo1 {
	
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		System.out.println(al1.size());
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add(30);
		al2.add(40);
		System.out.println(al2.size());
		System.out.println(al2);
		
//		al2.add(1,al1);
//		System.out.println(al2.size());
//		System.out.println(al2);
		
		al2.addAll(1,al1);
		System.out.println(al2.size());
		System.out.println(al2);
		
	}

}
