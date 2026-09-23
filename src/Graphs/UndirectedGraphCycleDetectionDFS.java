package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class UndirectedGraphCycleDetectionDFS {
    public static boolean CycleDetectionDFS(int node, int parent, List<List<Integer>> graph, boolean[] isVisited){
        isVisited[node] = true;
        for (int neighbour : graph.get(node)){
            if (!isVisited[neighbour]){
                if (CycleDetectionDFS(neighbour, node, graph, isVisited)){
                    return true;
                }
            }
            else if(neighbour!=parent){
                return true;
            }
        }
        return false;
    }

    public static boolean CycleDetection(List<List<Integer>> graph, int src, boolean[] isVisited){
        int V = graph.size();
        for (int i=0; i<V; i++){
            if (!isVisited[i]){
                if (CycleDetectionDFS(i, -1, graph, isVisited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Vertices in the Graph: ");
        int V = sc.nextInt();

        System.out.print("Enter the no. of Edges in the Graph: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter all the edges in the form of (u v): ");
        for (int i=0; i<E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] isVisited = new boolean[V];
        boolean ans = CycleDetection(graph, 0, isVisited);
        if (ans){
            System.out.println("Cycle Detected!");
        }
        else{
            System.out.println("No Cycle present in the Graph");
        }
    }
}
