package inheritance;

class Parent{
	static {
		System.out.println("Parent is loaded");
	}
	
	static void nuture() {
		System.out.println("Nuture children");
	}
}

class Child extends Parent{
	static {
		System.out.println("Child is loaded");
	}
	
	static void respect() {
		System.out.println("respect parent");
	}
}



public class RunTime {
	
	public static void main(String[] args) {
		//Parent.nuture();
		Child.respect();
	}

}
