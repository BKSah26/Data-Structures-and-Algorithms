package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSortDFS {
    public static void topologicalSortDFS(int src, List<List<Integer>> graph, Stack<Integer> stack, boolean[] isVisited){
        isVisited[src] = true;
        for (int neighbours: graph.get(src)){
            if (!isVisited[neighbours]){
                topologicalSortDFS(neighbours, graph, stack, isVisited);
            }
        }
        stack.push(src);
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
        }

        boolean[] isVisited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<V; i++){
            if (!isVisited[i]){
                topologicalSortDFS(i, graph, stack, isVisited);
            }
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
