package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(20);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("Size: "+q.size());
        System.out.println("Peak: "+ q.peek());
    }
}
