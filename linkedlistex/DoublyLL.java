package linkedlistex;

public class DoublyLL {
	Node head = null;
	Node tail = null;
	class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	public void insertBeg(int item) {
		Node newNode = new Node(item);
		if(this.head == null && this.tail == null) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
			
		}
	}
	public void display() {
		Node temp = this.head;
		while(temp.next != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL dll = new DoublyLL();
		dll.insertBeg(23);
		dll.insertBeg(56);
		dll.insertBeg(34);
		dll.insertBeg(60);
		dll.display();

	}

}