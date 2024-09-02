package HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueVowel {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		
		HashSet hs = new HashSet();
		
		char[] ch = str.toCharArray();
		
		for (char a : ch) {
			if (a == 'a' || a == 'e' || a== 'i' || a == 'o' || a == 'u')
				hs.add(a);
		}
		
		System.out.println(hs);
	}

}
