package Graphs;

import java.util.*;

//Kahn's Algorithm
public class TopologicalSortBFS {
    public static List<Integer> topologicalSortBFS(List<List<Integer>> graph, int[] inDegree){
        List<Integer> ans = new ArrayList<>();
        int V = inDegree.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<V; i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }

        while(q.size()>0){
            int top = q.remove();
            ans.add(top);
            for (int nodes : graph.get(top)){
                if (inDegree[nodes]!=0){
                    inDegree[nodes]--;
                    if (inDegree[nodes]==0){
                        q.add(nodes);
                    }
                }
            }
        }

        return ans;
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

        int[] inDegree = new int[V];
        Arrays.fill(inDegree, 0);

        for (int i=0; i<V; i++){
            for (int neighbours : graph.get(i)){
                inDegree[neighbours]++;
            }
        }

        List<Integer> finAns = topologicalSortBFS(graph, inDegree);
        for (int ele : finAns){
            System.out.print(ele+" ");
        }
//        boolean[] isVisited = new boolean[V];
    }
}
