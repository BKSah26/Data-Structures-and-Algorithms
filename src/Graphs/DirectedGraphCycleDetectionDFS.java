package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectedGraphCycleDetectionDFS {
    public static void DFS(int node, List<List<Integer>> graph, boolean[] visited, boolean[] path, boolean[] ans){
        visited[node] = true;
        path[node] = true;
        for (int neighbours : graph.get(node)){
            if (path[neighbours]){
                ans[0] = false;
                return;
            }
            if (!visited[neighbours]){
                DFS(neighbours, graph, visited, path, ans);
            }
        }
        path[node]=false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of Edges in the Graph: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter the edges in the form of (u v):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        boolean[] ans = new boolean[1];
        ans[0] = true;

        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];

        for (int i=0; i<V; i++){
            if (!visited[i]){
                DFS(i, graph, visited, path, ans);
            }
        }

        if (ans[0]==true){
            System.out.println("No Cycle Detected!");
        }
        else{
            System.out.println("Cycle Detected!");
        }
    }
}
