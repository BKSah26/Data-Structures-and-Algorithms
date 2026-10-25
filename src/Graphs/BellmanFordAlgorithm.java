package Graphs;

import java.util.*;

public class BellmanFordAlgorithm {
    public static class Edge{
        int u;
        int v;
        int w;
        Edge(int u, int v, int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        List<Edge> graph = new ArrayList<>();

        System.out.println("Enter the edges in the form of (u v d):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int d = sc.nextInt();
            graph.add(new Edge(u, v, d));
        }

        System.out.print("Enter source node: ");
        int src = sc.nextInt();

        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src]=0;

        for (int i=0; i<V-1; i++){
            for (Edge e : graph){
                if (distance[e.u] != Integer.MAX_VALUE){
                    int newDistance = distance[e.u]+e.w;
                    if (newDistance < distance[e.v]){
                        distance[e.v] = newDistance;
                    }
                }
            }
        }

        for (int i=0; i<V; i++) {
            System.out.println("Node: " + i + ", Distance: " + distance[i]);
        }
    }
}