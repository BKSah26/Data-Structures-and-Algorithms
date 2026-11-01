package Graphs;

import java.util.*;

public class KruskalAlgorithm {
    public static class Triplet implements Comparable<Triplet>{
        int u;
        int v;
        int d;

        Triplet(int u, int v, int d){
            this.u = u;
            this.v = v;
            this.d = d;
        }

        public int compareTo(Triplet t){
            return Integer.compare(this.d, t.d);
        }
    }

    public static int find(int[] parent, int a){
        if (a == parent[a]){
            return a;
        }
        int leader = find(parent, parent[a]);
        parent[a] = leader;
        return leader;
    }

    public static void union(int[] parent, int[] size, int a, int b){
        if (a!=b){
            if (size[a]>size[b]){
                parent[b]=a;
                size[a]+=size[b];
            }
            else{
                parent[a]=b;
                size[b]+=size[a];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();

        int[] parent = new int[V];
        int[] size = new int[V];
        for (int i=0; i<V; i++){
            parent[i]=i;
            size[i]=1;
        }

        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        System.out.println("Enter the edges in the form of (u v d):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int d = sc.nextInt();
            pq.add(new Triplet(u, v, d));
        }

        List<Triplet> minimumSpanningTree = new ArrayList<>();
        int sum = 0;
        while (pq.size()>0){
            Triplet top = pq.remove();
            int u = top.u;
            int v = top.v;
            int d = top.d;

            int a = find(parent, u);
            int b = find(parent, v);
            if (a!=b){
                union(parent, size, a, b);
                minimumSpanningTree.add(top);
                sum+=d;
            }
        }

        for (Triplet t : minimumSpanningTree){
            int u = t.u;
            int v = t.v;
            int d = t.d;
            System.out.println("U: "+u+" V: "+v+" Cost: "+d);
        }
        System.out.println("Cost of the Spanning Tree: "+sum);
    }
}
