package Binary_Search_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MorrisTraversal{
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

    public static void inorder(Node root){
        Node curr = root;
        while (curr!=null){
            if (curr.left!=null){
                Node pred = curr.left;
                while (pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                }
                if (pred.right==null){
                    pred.right = curr;
                    curr=curr.left;
                }
                if (pred.right == curr){
                    pred.right = null;
                    System.out.print(curr.val+" ");
                    curr = curr.right;
                }
            }
            else{
                System.out.print(curr.val+" ");
                curr=curr.right;
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"10", "5", "15", "2", "8", "12", "17"};
        Node root = constructBFS(arr);
        inorder(root);
    }
}
