package Basic_Programs;

public class ReverseNum {
	public static void main(String[] args) {
		int num = 1243;
		System.out.println("number : "+num);
		int tem = num;
		
		int rev= 0;
		
		while (tem > 0) {
			rev = (rev*10) + (tem % 10);
			tem = tem / 10;
		}
		System.out.println("revrse:"+rev);
		
		if (num == rev) System.out.println("Palindrom");
		else System.out.println("Not Palindrom");
	}

}
