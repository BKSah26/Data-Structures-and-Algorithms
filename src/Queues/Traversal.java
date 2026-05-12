package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        int n = q.size();
        for (int i=0; i<n; i++){
            int val = q.remove();
            System.out.print(val+" ");
            q.add(val);
        }
        System.out.println();

        System.out.println(q);
    }
}
