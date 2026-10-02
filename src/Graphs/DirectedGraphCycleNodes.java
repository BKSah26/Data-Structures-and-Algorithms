package Graphs;

import java.util.*;

public class DirectedGraphCycleNodes {
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

        System.out.println("Enter the edges in the form of (u v):");
        for (int i=0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        List<List<Integer>> newGraph = new ArrayList<>();
        for (int i=0; i<V; i++){
            List<Integer> ans = new ArrayList<>();
            newGraph.add(ans);
        }

        for (int i=0; i<V; i++){
            for (int neighbours : graph.get(i)){
                newGraph.get(neighbours).add(i);
            }
        }

        int[] inDegree = new int[V];
        for (int i=0; i<V; i++){
            for (int nodes : newGraph.get(i)){
                inDegree[nodes]++;
            }
        }

        Set<Integer> set = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V; i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }

        while (q.size()>0){
            int top = q.remove();
            set.add(top);
            for (int nodes : newGraph.get(top)){
                inDegree[nodes]--;
                if (inDegree[nodes]==0){
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
