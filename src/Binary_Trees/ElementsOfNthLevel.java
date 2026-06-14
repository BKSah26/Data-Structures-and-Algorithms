package Binary_Trees;

public class ElementsOfNthLevel {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void nthLevel(Node root, int n){
        if (root==null){
            return;
        }
        if (n==1){
            System.out.print(root.val+" ");
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        nthLevel(root, 1);
        System.out.println();
        nthLevel(root, 2);
        System.out.println();
        nthLevel(root, 3);
    }
}
