package Graphs;

import java.util.*;

public class FloydWarshallAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        int[][] graph = new int[V][V];
        for (int i=0; i<V; i++){
            for (int j=0; j<V; j++){
                if (i==j){
                    graph[i][j]=0;
                }
                else{
                    graph[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        System.out.println("Enter the edges in the form of (u v d):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int d = sc.nextInt();
            graph[u][v]=d;
            graph[v][u]=d;
        }

        for (int k=0; k<V; k++){
            for (int i=0; i<V; i++){
                for (int j=0; j<V; j++){
                    if (graph[i][k]!=Integer.MAX_VALUE && graph[k][j]!=Integer.MAX_VALUE){
                        graph[i][j]=Math.min(graph[i][j], graph[i][k]+graph[k][j]);
                    }
                }
            }
        }

        System.out.println("Updates Graph with Minimum Distances:");
        for (int i=0; i<V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}