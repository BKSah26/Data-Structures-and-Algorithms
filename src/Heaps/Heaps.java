package Heaps;

import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
        //MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(-30);
        pq.add(15);
        pq.add(5);
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);
        for (int ele : pq){
            System.out.print(ele+" ");
        }
    }
}
