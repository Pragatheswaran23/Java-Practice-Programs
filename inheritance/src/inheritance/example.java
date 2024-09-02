package inheritance;


class Person {

    String name;

    Person(){
    }

    Person(String name){
    	this.name = name;
    }
}

class Student extends Person{
	int sid;
	
	Student(){}
	
	Student(int sid, String name){
		this.sid = sid;
		this.name = name;
		super.name = "123";
	}
}

public class example {
	
	public static void main(String[] args) {
		Student s = new Student(10, "abcd");
		System.out.println(s.name);
	}

}
