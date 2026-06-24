package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int data){
            val = data;
        }
    }

    public static Node constructBFS(String[] arr){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while (i<n-1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);

            if (arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }

            if (arr[i+1].equals("")){
                right = null;
            }
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5", "6", "7"};
        Node root = constructBFS(arr);
        preorder(root);
    }
}
