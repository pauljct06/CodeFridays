public class Findx {

    Queue<Integer> myqueue = new Queue<Integer>();
    finder(root, x);

    public static void finder(Node node, int x) {
        if (node != null && node.data <= x) {
            myqueue.enqueue(x);
            finder(node.left, x);
            finder(node.right, x);
        }


                    4
           5                        6
    15         9              7       20
16 25   14  12              11  8


        if (node.data <= x) {
            myqueue.enqueue(x);
        }
        if (node.left.data <= x) {
            add(node.left, x);
        }
        if (node.right.data <= x) {
            add(node.right, x);
        }
        return;
    }
}