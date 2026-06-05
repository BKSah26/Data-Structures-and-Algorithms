package Binary_Trees;

public class Implementation {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void display(Node root){
        Node x = root;
        if (x==null){
            return;
        }

        System.out.print(x.val +" -> ");

        if (x.left!=null){
            int l = x.left.val;
            System.out.print(l+" ");
        }
        else{
            System.out.print("Null ");
        }

        if (x.right!=null){
            int r = x.right.val;
            System.out.print(r+" ");
        }
        else{
            System.out.print("Null ");
        }
        System.out.println();

        display(x.left);
        display(x.right);
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

        display(root);
    }
}
