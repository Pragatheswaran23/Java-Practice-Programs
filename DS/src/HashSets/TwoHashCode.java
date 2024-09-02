package HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class TwoHashCode {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Number of elements in set 1: ");
		int size1 = s.nextInt();
		
		HashSet<Integer> hs1 = new HashSet();
		System.out.println("Enter set 1: ");
		for (int i=0; i<size1; i++) {
			hs1.add(s.nextInt());
		}
		
		System.out.print("Number of elements in set 2: ");
		int size2 = s.nextInt();
		HashSet<Integer> hs2 = new HashSet();
		System.out.println("Enter set 2: ");
		for (int i=0; i<size2; i++) {
			hs2.add(s.nextInt());
		}
		
		HashSet<Integer> hs3 = new HashSet();
		for (int a : hs2) {
			if (hs1.contains(a)) {
				hs3.add(a);
			}
		}
		
		
		System.out.println(hs3);
		
		
		
	}

}
