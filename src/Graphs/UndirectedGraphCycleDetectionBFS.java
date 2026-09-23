package Graphs;

import java.util.*;

public class UndirectedGraphCycleDetectionBFS {

    public static class Pair {
        int node;
        int parent;
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean checkForCycleBFS(int src, List<List<Integer>> graph, boolean[] isVisited) {
        Queue<Pair> q = new LinkedList<>();

        isVisited[src] = true;
        q.add(new Pair(src, -1));

        while (!q.isEmpty()) {
            Pair peek = q.remove();
            int node = peek.node;
            int parent = peek.parent;

            for (int neighbor : graph.get(node)) {
                if (!isVisited[neighbor]) {
                    isVisited[neighbor] = true;
                    q.add(new Pair(neighbor, node));
                }
                else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V, List<List<Integer>> graph) {
        boolean[] isVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!isVisited[i]) {
                if (checkForCycleBFS(i, graph, isVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter the no. of Edges: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v): ");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        if (isCycle(V, graph)) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph doesn't contain any cycle.");
        }

        sc.close();
    }
}