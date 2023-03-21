public class LinkedList{
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next =null;
		}
	}

	public Node head =null;
	public Node tail =null;

	public void addNode(int data){
		Node newNode = new Node(data);

		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
	}

	public void display(){

		Node current = head;

		if(head==null){
			System.out.println("The list is empty");
		}

		while(current!=null){
			System.out.println(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}

	public void printReverse(Node head){
		if(head==null)
		return;
		printReverse(head.next);
		System.out.println(head.data+" ");
	}

	public void removeDuplicate(){
		Node ptr1=null,ptr2=null;
		ptr1=head;
		while(ptr1!=null && ptr1.next!=null){
			ptr2=ptr1;
			while(ptr2.next !=null){
				if(ptr1.data==ptr2.next.data){
					ptr2.next=ptr2.next.next;
					System.gc();
				}
				else{
					ptr2=ptr2.next;
				}
			}
			ptr1=ptr1.next;
		}
	} 

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(7);
		list.addNode(4);
		list.addNode(6);
		list.addNode(7);
		list.addNode(8);

		list.display();

		list.printReverse(list.head);
		list.removeDuplicate();
		System.out.println();
		list.display();

	}

}