package Senario;

import java.util.Scanner;
import java.util.TreeSet;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		if (c1.length == c2.length) {
			TreeSet<Character> ts1 = new TreeSet();
			TreeSet<Character> ts2 = new TreeSet();
			int count=0;
			for (int i=0; i<c1.length; i++) {
				ts1.add(c1[i]);
				ts2.add(c2[i]);
			}
			for (Character c : ts1) {
				if (ts2.contains(c)) {
					count++;
				}
			}
			if (count == ts1.size()) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}
 

	}

}
