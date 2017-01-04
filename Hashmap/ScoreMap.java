public class ScoreMap {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //private List<Node> array;
    private Node[] array;
    public final int MAXSIZE = 200;

    public ScoreMap() {
        this.array = new Node[MAXSIZE];
        //this.array = new ArrayList<Node>();
    }

    //key is one team score, val is the other team score
    public void put(int bear, int anteater) {
        if (containskey(bear)) {
            Node curr = get(bear);

            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(anteater);
        }
        else {
            array[bear] = new Node(anteater);
        }
    }

    public boolean containskey(int bear) {
        return (this.array[bear] != null && bear < MAXSIZE);
    }

    public Node get(int bear) {
        return this.array[bear];
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
    public int findMatches(int bear, int anteater) {
        int numofmatches = 0;
        if (this.array[bear] != null) {
            Node ele = this.array[bear];
            while (ele != null) {
                if (ele.data == anteater) {
                    numofmatches++;
                }
                ele = ele.next;
            }
        }
        return numofmatches;
    }

    public static void main(String[] args) {
        ScoreMap hm = new ScoreMap();

        hm.put(1,2);
        hm.put(2,2);
        hm.put(2,3);
        hm.put(2,2);

        hm.put(3,4);
        hm.put(2,5);

        int prevmatchesqty = hm.findMatches(2,2);
        System.out.println(prevmatchesqty);

    }
}