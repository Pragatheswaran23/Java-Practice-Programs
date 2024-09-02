package Senario;

public class Emp {
	
	static Employee [] employee;
	
	public static void getEmpNo(int count) {
		employee = new Employee[count];
	}
	
	static int i=0;
	public static void addEmp(String name, int salary) {
		if (i<employee.length) {
			employee[i] = new Employee();
			employee[i].setName(name); 
			String id = "BattleField_" + Integer.toString(i);
			employee[i].setId(id);
			employee[i].setSalary(salary);
			i++;
		}else {
			System.out.println("no more");
		}
	}
	
	public static void display() {
		for (Employee em : employee) {
			System.out.println("\n\nName:" + em.getName());
			System.out.println("Id : " + em.getId());
			System.out.println("Salary : " + em.getSalary());
		}
	}

}
