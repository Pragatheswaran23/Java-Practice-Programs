package Basic_program;

public class Spy {
	public static void main(String[] args) {
		int num = 123;
		int tem = num;
		
		int sum= 0; 
		int mul=1;
		
		while (tem>0){
			sum += (tem%10);
			mul *= (tem%10);
			
			tem /= 10;
		}
		System.out.println("Sum:"+sum+"\nMul:"+mul);
		if  (sum==mul) {
			System.out.println("Syp no.");
		}else {
			System.out.println("not a syp no.");
		}
		
	}

}
