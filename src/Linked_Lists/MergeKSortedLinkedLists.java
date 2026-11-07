package Linked_Lists;

import java.util.*;

public class MergeKSortedLinkedLists {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static Node merge(Node head1, Node head2){
        Node t = new Node(-1);

        Node i = head1;
        Node j = head2;
        Node k = t;

        while (i!=null && j!=null){
            if (i.val<j.val){
                k.next = i;
                i=i.next;
            }
            else{
                k.next = j;
                j=j.next;
            }
            k=k.next;
        }
        if (i!=null){
            k.next = i;
        }
        if (j!=null){
            k.next = j;
        }
        return t.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of Linked Lists: ");
        int m = sc.nextInt();

        ArrayList<Node> heads = new ArrayList<>();
        for (int i=0; i<m; i++){
            System.out.println("Enter the no. of elements in the Linked List:");
            int n = sc.nextInt();
            int first = sc.nextInt();
            Node head = new Node(first);
            heads.add(head);
            Node ptr = head;
            for (int j=0; j<n-1; j++){
                int ele = sc.nextInt();
                Node temp = new Node(ele);
                ptr.next = temp;
                ptr = ptr.next;
            }
        }

        Queue<Node> queue = new LinkedList<>();
        for (Node head : heads){
            queue.add(head);
        }

        while (queue.size()!=1){
            Node t1 = queue.remove();
            Node t2 = queue.remove();
            Node t = merge(t1, t2);
            queue.add(t);
        }

        Node finalHead = queue.remove();
        Node ptr = finalHead;

        while (ptr!=null){
            System.out.print(ptr.val+" ");
            ptr=ptr.next;
        }
    }
}
