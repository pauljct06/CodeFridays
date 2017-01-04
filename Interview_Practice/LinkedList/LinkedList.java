public class LinkedList {

 	private class Node {

 		public String data;
 		public Node next;

 		public Node(String data) {
 			this.data = data;
 			this.next = null;
 		}
 	}

 	private Node head;

 	public LinkedList(){
 		this.head = null;
 	}

 	public LinkedList(Node myNode) {
 		this.head = myNode;
 	}


 	public void add(String a) {

 		Node newNode = new Node(a);

 		if(this.head == null) {
 			this.head = newNode;
 			return;
 		}

 		Node curr = this.head;

 		while(curr.next != null) {

 			curr = curr.next;
 		}

   		curr.next = newNode;

 	}

 	public void print() {

 		Node curr = this.head;

 		while( curr != null) {

 			System.out.println(curr.data);
 			curr = curr.next;
 		}
 	}

 	public void remove(String r) {

  		if(this.head.data.equals(r)) {
  			this.head = this.head.next;
  			return;
  		}

  		Node curr = this.head;

  		System.out.println(curr.next.data.equals(r));

  		while (!curr.next.data.equals(r)) {

  			System.out.println("im inside the loop");
  			curr = curr.next;
   		}

   		curr.next = curr.next.next;

 	}

 	public String getNth(int n) {

 		Node curr = this.head;
 		Node prev = this.head;

 		while (n>0) {

 			n--;
 			curr = curr.next;
 		}

 		while (curr != null) {

 			curr = curr.next;
 			prev = prev.next;
 		}

 		return prev.data;
 	}

 	//Begin
 	public static void main(String[] args) {

 		LinkedList list = new LinkedList();
 		list.add("one");
 		list.add("two");
 		list.add("three");
 		list.add("four");
 		list.add("five");
 		list.add("six");

 		list.print();

 		list.remove("three");

 		list.print();

 		System.out.println(list.getNth(5));
 	}
}