package Binary_Trees;

public class SumOfNodes {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static int sumOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int a = sumOfNodes(root.left);
        int b = sumOfNodes(root.right);
        return a+b+root.val;
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

        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println("Sum of Nodes: "+ sumOfNodes(root));
    }
}
