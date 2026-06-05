package Binary_Trees;

public class MinValue {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static int minVal(Node root){
        if (root == null){
            return Integer.MAX_VALUE;
        }
        int leftVal = minVal(root.left);
        int rightVal = minVal(root.right);
        return Math.min(Math.min(leftVal, rightVal), root.val);
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

        System.out.println("Mininum Value: "+minVal(root));
    }
}
