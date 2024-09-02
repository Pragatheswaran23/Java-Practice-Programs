package ArrayLists;

public class Employee implements Comparable {
	
	String name;
	String id;
	
	Employee(){}
	
	Employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name : " + this.name + ", ID : " + this.id;
	}

	@Override
	public int compareTo(Object o) {
		
		Employee e = (Employee) o;
		
		return this.name.compareTo(e.name);
	}
}
