package ArrayLists;

import java.util.*;

public class PrimeNo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		for (int i = 2; i<=100;i++) {
			int count = 0;
			for (int j=2; j<i/2;j++) {
				if ((i%j) == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
	}

}
