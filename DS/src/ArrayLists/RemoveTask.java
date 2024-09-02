package ArrayLists;

import java.util.ArrayList;

public class RemoveTask {
	
	public static void main(String[] args) {
		ArrayList arr_list = new ArrayList();
		
		arr_list.add(4);
		arr_list.add(2);
		arr_list.add(7);
		arr_list.add(3);
		arr_list.add(8);
		arr_list.add(1);
		
		int n = 5;
		
		for (int i=0; i<arr_list.size(); i++) {
			Integer value = (Integer) arr_list.get(i);
			
			if ( value > n) {
				arr_list.remove(i);
			}
		}
		
		System.out.println(arr_list);
		
		
	}

}
