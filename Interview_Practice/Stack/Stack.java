public class Stack {
    // create node class
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // create node pointer to the head
    private Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int n) {
        Node newNode = new Node(n);

        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node curr = this.head;
            this.head = newNode;
            this.head.next = curr;
        }

    }

    public int pop() {
        if (this.head == null) {
            return -1;
        }

        Node curr = this.head;
        this.head = this.head.next;

        return curr.data;
    }

    public int peek() {
        return (this.head != null) ? this.head.data : -1;
    }

    public void print() {
        Node curr = this.head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        System.out.println();
    }

    public static void main (String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();

        System.out.println("deleting " + stack.pop());
        System.out.println("peeking " + stack.peek());

        stack.print();
    }


}