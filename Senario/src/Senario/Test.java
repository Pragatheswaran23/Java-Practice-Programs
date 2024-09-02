package Senario;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the number of instance :");
		int count = sn.nextInt();
		
		Emp.getEmpNo(count);
		
		for (int i=0; i<count; i++) {
			sn.nextLine();
			System.out.print("Employee Name : ");
			String name = sn.nextLine();
			System.out.print("Employee Salary : ");
			int salary = sn.nextInt();
			
			Emp.addEmp(name, salary);
		}
		
		Emp.display();
		
		sn.close();
	}

}
