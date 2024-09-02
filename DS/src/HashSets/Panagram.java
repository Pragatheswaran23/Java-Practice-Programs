package HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		HashSet hs = new HashSet();
		
		char[] ch = str.toCharArray();
		
		for (char a : ch) {
			if (a >= 'a' && a<='z' )
				hs.add(a);
		}
		if (hs.size() == 26) System.out.println("Panagram");
		else System.out.println("Not Panagram");
	}

}
