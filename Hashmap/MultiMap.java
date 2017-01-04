import java.util.*;

public class MultiMap {
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //private List<Node> array;
    private Node[] array;
    public final int MAXSIZE = 100;

    public MultiMap() {
        this.array = new Node[MAXSIZE];
        //this.array = new ArrayList<Node>();
    }

    public void put(int key, String val) {
        if (containsKey(key)) {
            Node curr = get(key);

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(val);
        }
        else {
            array[key] = new Node(val);
        }
    }

    public boolean containsKey(int key) {
        return (this.array[key] != null && key < MAXSIZE);
    }

    public Node get(int key) {
        return this.array[key];
    }

    public void print() {
        for (Node ele: this.array) {
            boolean hasElements = false;

            while (ele != null) {
                hasElements = true;
                System.out.print(ele.data + " -> ");
                ele = ele.next;
            }

            if (hasElements) {
                System.out.println();
            }
        }
    }
    public ArrayList<String> findAll(int key) {
        ArrayList<String> k = new ArrayList<String>();
        if (this.array[key] != null) {
            Node ele = this.array[key];
            while (ele != null) {
                k.add(ele.data);
                ele = ele.next;
            }
            return k;
        }
        return null;
    }

    public static void main(String[] args) {
        MultiMap hm = new MultiMap();

        hm.put(1,"V1");
        hm.put(2,"V2");
        hm.put(2,"V3");
        hm.put(2,"V4");

        hm.put(3,"V5");
        hm.put(2,"V6");

        hm.print();

        System.out.println();

        ArrayList<String> k = hm.findAll(2);

        for (String x: k) {
            System.out.print(x + " -> ");
        }
        System.out.println();

    }
}