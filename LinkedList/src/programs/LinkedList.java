package programs;

public class LinkedList {
	
	int size;
	Node head;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			head = newNode;
		}else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
		size++;
	}
	
	public String toString() {
		Node cur = head;
		String result = "[";
		while (cur != null) {
			result += cur +  ",";
			cur = cur.next;
		}
		result += "]";
		return result;
	}
	
	public int getValue(int index) {
		Node cur = head;
		if ((index >= size) || (index < 0)) {
			System.out.print ("Index out of bound. For the index ");
			return index;
		}else {
			int s = 0;
			while (s != index) {
				cur = cur.next;
				s++;
			}
			return cur.data;
		}
	}
	
	public void remove(int data) {
		Node cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = newNode;
	}

}
