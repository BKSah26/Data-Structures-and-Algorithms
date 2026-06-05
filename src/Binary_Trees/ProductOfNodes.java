package Binary_Trees;

public class ProductOfNodes {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static int product(Node root){
        if (root==null){
            return 1;
        }
        int leftVal = product(root.left);
        int rightVal = product(root.right);
        return root.val*leftVal*rightVal;
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        Node a = new Node(4);
        Node b = new Node(8);

        root.left = a;
        root.right = b;

        Node c = new Node(9);
        Node d = new Node(6);
        Node e = new Node(5);

        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println("Product: "+ product(root));
    }
}
