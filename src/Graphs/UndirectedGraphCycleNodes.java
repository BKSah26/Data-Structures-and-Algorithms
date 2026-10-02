package Graphs;

import java.util.*;

public class UndirectedGraphCycleNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the Graph: ");
        int V = sc.nextInt();
        System.out.print("Enter the no. of edges in the Graph: ");
        int E = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<V; i++){
            List<Integer> arr = new ArrayList<>();
            graph.add(arr);
        }

        System.out.println("Enter all the edges in the graph:");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] degree = new int[V];
        for (int i=0; i<V; i++){
            for (int nodes : graph.get(i)){
                degree[nodes]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<V; i++){
            if (degree[i]<=1){
                q.add(i);
            }
        }

        while (q.size()>0){
            int top = q.remove();
            set.add(top);
            for (int nodes : graph.get(top)){
                degree[nodes]--;
                if (degree[nodes]==1){
                    q.add(nodes);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<V; i++){
            if (!set.contains(i)){
                ans.add(i);
            }
        }

        System.out.println("Nodes that are part of Cycle: ");
        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
