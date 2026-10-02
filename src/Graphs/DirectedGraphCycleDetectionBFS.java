package Graphs;

import java.util.*;

public class DirectedGraphCycleDetectionBFS {
    public static List<Integer> KahnAlgorithm(List<List<Integer>> graph, int[] inDegree){
        int V = graph.size();
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V; i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }

        while (q.size()>0){
            int top = q.remove();
            ans.add(top);
            for (int nodes : graph.get(top)){
                inDegree[nodes]--;
                if (inDegree[nodes]==0){
                    q.add(nodes);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<V; i++){
            List<Integer> edges = new ArrayList<>();
            graph.add(edges);
        }

        System.out.println("Enter all the edges in the form of (u v): ");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        int[] inDegree = new int[V];
        for (int i=0; i<V; i++){
            for (int nodes: graph.get(i)){
                inDegree[nodes]++;
            }
        }

        List<Integer> ans = KahnAlgorithm(graph, inDegree);
        if (ans.size()<V){
            System.out.println("Cycle Detected!");
        }
        else{
            System.out.println("No Cycle Found!");
        }
    }
}
