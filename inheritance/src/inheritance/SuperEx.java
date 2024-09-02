package inheritance;

class Base{
	int a = 100;
	Base(){
		System.out.println(a);
	}
	static int b;
}

class Dirived extends Base{
	int a  = 10;
	static int c = 32;
	Dirived(){
		super();
		System.out.println(super.b);
		System.out.println(this.a);
	}
}


public class SuperEx {
	
	public static void main(String[] args) {
		Dirived d = new Dirived();
		System.out.println(Dirived.c);

		System.out.println(Dirived.b);
	}

}
