package Graphs;

import java.util.*;

public class DisjointSetUnion {
    public static int find(int[] parent, int a){
        if (parent[a] == a){
            return a;
        }
        return find(parent, parent[a]);
    }
    public static void union(int[] parent, int a, int b){
        int gA = find(parent, a);
        int gB = find(parent, b);
        if (gA!=gB){
            parent[gB]=gA;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        int[][] graph = new int[E][2];
        System.out.println("Enter the graph in the form of (u v):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[i][0]=u;
            graph[i][1]=v;
        }

        int[] parent = new int[V];
        for (int i=0; i<V; i++){
            parent[i]=i;
        }

        for (int i=0; i<E; i++){
            union(parent, graph[i][0], graph[i][1]);
        }

        int count = 0;
        for (int i=0; i<V; i++){
            if(parent[i]==i){
                count++;
            }
        }
        System.out.println("Connected Components: "+count);
    }
}
