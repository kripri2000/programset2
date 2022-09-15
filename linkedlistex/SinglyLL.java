package linkedlistex;

public class SinglyLL {
	Node start = null;
	
	class Node{
		private int data;
		private Node link;
		public Node(int data) {
			this.data = data;
			this.link = null;
		}
	}
	//insert to beginning in the list
	public void insertBeg(int item) {
		Node newNode = new Node(item);
		if(this.start == null)  //ll empty
			this.start = newNode;
		else {
			newNode.link = this.start;
			this.start = newNode;
		}
		//System.out.println("Insertion successful");
		//display();
		}
	/*public void insertEnd(int item) {
		Node newNode = new Node(item);
		if(this.start == null)  //ll empty
			this.start = newNode;
		else {
			Node temp = this.start;
			while(temp.link!=null)
				temp = temp.link;
			temp.link = newNode;
		}
		//display();
	}
	public void insertPos(int pos,int item) {
		Node newNode = new Node(item);
		if(pos == 1)
			insertBeg(item);
		else {
			Node temp = this.start;
			Node loc = temp.link;
			for(int i=0;i<pos-2;i++) {
				temp = temp.link;
				loc = loc.link; 
			}
			temp.link = newNode;
			newNode.link = loc;			
		}
	}*/
	public void display() {
		Node temp = this.start;
		while(temp.link != null) {
			System.out.print(temp.data+" ");
			temp = temp.link;
		}
		System.out.println(temp.data);
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLL sll = new SinglyLL();
		sll.insertBeg(23);
		//sll.insertEnd(56);
		sll.insertBeg(34);
		//sll.insertPos(2,60);
		sll.display();

	}

}
