package linkedlistex;

public class CircularLL {
	Node head = null;
	Node tail = null;

	class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void insert(int item) {
		Node newNode = new Node(item);
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			Node temp = this.head;
			while(temp != this.tail)
				temp = temp.next;
			temp.next = newNode;
			newNode.next = this.head;
			this.tail = newNode;
		}
}
	public void display() {
		Node temp = this.head;
		while(temp != this.tail) {
			System.out.print(temp.data+" ");
			temp = temp.next;	
		}
		System.out.print(temp.data);
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL cll = new CircularLL();
		cll.insert(29);
		cll.insert(34);
		cll.insert(4);
		cll.insert(5);
		cll.display();
		

	}

}
