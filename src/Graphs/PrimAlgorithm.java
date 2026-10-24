package Graphs;

import java.util.*;

class Triplet implements Comparable<Triplet>{
    int node;
    int parent;
    int cost;

    Triplet(int node, int parent, int cost){
        this.node = node;
        this.parent = parent;
        this.cost = cost;
    }

    public int compareTo(Triplet t){
        return Integer.compare(this.cost, t.cost);
    }
}

public class PrimAlgorithm {
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

        List<Triplet> minimumSpanningTree = new ArrayList<>();
        int sum = 0;
        boolean[] isVisited = new boolean[V];
        Arrays.fill(isVisited, false);

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, -1, 0));
        while (pq.size()>0){
            Triplet top = pq.remove();
            int node = top.node;
            int parent = top.parent;
            int cost = top.cost;

            if (isVisited[node]){
                continue;
            }

            isVisited[node] = true;

            if (parent != -1){
                minimumSpanningTree.add(top);
                sum+=cost;
            }

            for (Pair p : graph.get(node)){
                if (p.node == parent){
                    continue;
                }
                if (!isVisited[p.node]){
                    pq.add(new Triplet(p.node, node, p.dist));
                }
            }
        }

        for (Triplet t : minimumSpanningTree){
            int node = t.node;
            int parent = t.parent;
            int cost = t.cost;
            System.out.println("Node: "+node+" Parent: "+parent+" Cost: "+cost);
        }
        System.out.println("Cost of the Spanning Tree: "+sum);
    }
}
