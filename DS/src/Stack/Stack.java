package Stack;

public class Stack {
	
	int size;
	int a[];
	int top=-1;
	
	Stack (int size){
		this.size = size;
		a = new int[size];
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public void push(int data) {
		if (isFull()) {
			System.out.println("StackOverFlow");
		}
		else {
			top++;
			a[top] = data;
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void pop() {
		if (isEmpty()) {
			System.out.println("StackUnderFlow");
		}
		else {
			System.out.println(a[top]);
			top--;
		}
	}
	
	

}
