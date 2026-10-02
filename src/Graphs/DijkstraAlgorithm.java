package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair>{
    int node;
    int dist;

    Pair(int node, int dist){
        this.node = node;
        this.dist = dist;
    }

    public int compareTo(Pair p){
        return Integer.compare(this.dist, p.dist);
    }
}

public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        List<List<Pair>> graph = new ArrayList<>();
        for (int i=0; i<V; i++){
            List<Pair> arr = new ArrayList<>();
            graph.add(arr);
        }

        System.out.println("Enter the edges in the form of (u v d):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int d = sc.nextInt();
            Pair node1 = new Pair(u, d);
            Pair node2 = new Pair(v, d);
            graph.get(u).add(node2);
            graph.get(v).add(node1);
        }

        System.out.print("Enter source node: ");
        int src = sc.nextInt();

        int[] distance = new int[V];
        for (int i=0; i<V; i++){
            if (i==src){
                distance[i]=0;
            }
            else{
                distance[i]=Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        while (pq.size()>0){
            Pair top = pq.remove();
            int n = top.node;
            int d = top.dist;

            if (d>distance[n]){
                continue;
            }

            for (Pair p : graph.get(n)){
                int totalDist = d+p.dist;
                if (totalDist<distance[p.node]){
                    distance[p.node] = totalDist;
                    pq.add(new Pair(p.node, totalDist));
                }
            }
        }

        for (int i=0; i<V; i++){
            System.out.println("Node: "+i+", Distance: "+distance[i]);
        }
    }
}
