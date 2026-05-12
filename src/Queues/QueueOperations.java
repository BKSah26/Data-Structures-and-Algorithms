package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void display(Queue<Integer> q){
        int n = q.size();
        for (int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void addAtIndex(Queue<Integer> q, int idx, int val){
        int n = q.size();
        if (idx<0 || idx>n){
            return;
        }
        for (int i=0; i<idx; i++){
            q.add(q.remove());
        }
        q.add(val);
        for (int i=idx; i<n; i++){
            q.add(q.remove());
        }
    }

    public static int removeAtIndex(Queue<Integer> q, int idx){
        int n = q.size();
        if (idx<0 || idx>=n){
            return -1;
        }
        for (int i=0; i<idx; i++){
            q.add(q.remove());
        }
        int ans = q.remove();
        for (int i=idx; i<n-1; i++){
            q.add(q.remove());
        }
        return ans;
    }

    public static int valAtIndex(Queue<Integer> q, int idx){
        int n = q.size();
        if (idx<0 || idx>=n){
            return -1;
        }
        for (int i=0; i<idx; i++){
            q.add(q.remove());
        }
        int ans = q.peek();
        for (int i=idx; i<n; i++){
            q.add(q.remove());
        }
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        display(q);

        addAtIndex(q, 3, 60);
        display(q);
        addAtIndex(q, 6, 70);
        display(q);

        System.out.println(removeAtIndex(q, 2));
        display(q);

        System.out.println(valAtIndex(q, 2));
        System.out.println(valAtIndex(q, 5));

    }
}
