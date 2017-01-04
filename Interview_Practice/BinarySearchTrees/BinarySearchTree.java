import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

  private class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  private Node root;

  public BinarySearchTree() {
    this.root = null;
  }

  public void insert(int data) {
    Node newNode = new Node(data);

    this.root = insert(this.root, newNode);
  }

  public Node insert(Node parent, Node newNode) {
    if (parent == null) {
      return newNode;
    }

    if (newNode.data < parent.data) {
      parent.left = insert(parent.left, newNode);
    } else {
      parent.right = insert(parent.right, newNode);
    }

    return parent;
  }



  public void remove(int data) {
    this.root = remove(this.root, data);
  }


 //           70
 //   35             94
 // 12  40        90    100
 //            89

  // no children, 1 children, 2 children
  public Node remove(Node current, int data) {
    if (current == null) {
      return null;
    }

    if (data < current.data) {
      current.left = remove(current.left, data);
    }
    else if (data > current.data) {
      current.right = remove(current.right, data);
    }
    else {
      // equal to data

      if (current.left == null && current.right == null) {
        current = null;
      }
      // check for 1 child: left
      else if (current.left != null && current.right == null) {
        current = current.left;
      }
      // check for 1 child: right
      else if (current.left == null && current.right != null) {
        current = current.right;
      }
      // check for 2 children
      else {
        Node smallestNode = getSmallestNode(current.right);
        smallestNode.right = remove(current.right, smallestNode.data);
        smallestNode.left = current.left;
        current = smallestNode;
      }
    }

    return current;
  }

  public Node getSmallestNode(Node current) {
    if (current.left == null) {
      return current;
    }

    return getSmallestNode(current.left);
  }


 //           70
 //   35              94
 // 12  40        90     100
 //             89
 //  pre: 70, 35, 12, 40, 94, 90, 100

 //  in: 12, 35, 40, 70, 90, 94, 100

 //  post: 12, 40, 35, 90, 100, 94, 70

 //  lvl: 70, 35, 94, 12, 40, 90, 100, 89

  public void traverse() {
    //preOrderTrav(this.root);
    //inOrderTrav(this.root);
    //postOrderTrav();
    levelOrderTrav();
    System.out.println();
  }

  public void preOrderTrav(Node current) {
    if (current != null) {
      System.out.print(current.data + "  ");
      preOrderTrav(current.left);
      preOrderTrav(current.right);
    }
  }

  public void inOrderTrav(Node current) {
    if (current != null) {
      inOrderTrav(current.left);
      System.out.print(current.data + "  ");
      inOrderTrav(current.right);
    }
  }

  public void postOrderTrav(Node current) {
    if (current != null) {
      preOrderTrav(current.left);
      preOrderTrav(current.right);
      System.out.print(current.data + "  ");
    }
  }
  public void levelOrderTrav() {
        levelOrderTrav(this.root);
    }

    public void levelOrderTrav(Node current) {
        if (current == null) {
            return;
        }

        Queue<Node> q = new LinkedList <Node>();

        System.out.print(current.data + " ");

        if (current.left != null) {
            q.add(current.left);
        }

        if (current.right != null) {
            q.add(current.right);
        }

        while (!q.isEmpty()) {
            current = q.remove();

            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }

            if (current.right != null) {
                q.add(current.right);
            }
        }
    }
 //           70
 //   35                94
 // 12  40          90     100
 //             89

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.insert(70);
    bst.insert(35);
    bst.insert(94);
    bst.insert(40);
    bst.insert(12);
    bst.insert(100);
    bst.insert(90);
    bst.insert(89);

    bst.traverse();

    bst.remove(94);

    bst.traverse();
  }
}
