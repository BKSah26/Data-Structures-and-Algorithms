package Binary_Trees;

public class MaxValue {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static int maxNode(Node root){
        if (root==null){
            return Integer.MIN_VALUE;
        }
        int leftVal = maxNode(root.left);
        int rightVal = maxNode(root.right);
        return Math.max(Math.max(leftVal, rightVal), root.val);
    }

    public static void main(String[] args) {
        Node root = new Node(7);
        Node a = new Node(4);
        Node b = new Node(8);

        root.left = a;
        root.right = b;

        Node c = new Node(9);
        Node d = new Node(6);
        Node e = new Node(1);

        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println("Maximum Value: "+maxNode(root));
    }
}
