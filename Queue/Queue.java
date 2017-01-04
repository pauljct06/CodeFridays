public class Queue {
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

    public Queue() {
        this.head = null;
    }

    public void enqueue(int n) {
        Node newNode = new Node(n);

        if (this.head == null) {
            this.head = newNode;
        }
        else {
            Node curr = this.head;

            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
        }

    }

    public int dequeue() {
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
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.print();

        System.out.println("deleting " + queue.dequeue());
        System.out.println("peeking " + queue.peek());

        queue.print();
    }


}