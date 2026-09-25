package Backtracking;

import java.util.Scanner;

public class ChromaticNumber {
    public static boolean graphColoring(int node, int c, int[][] graph, int[] colors){
        int n = graph.length;
        if (node == n){
            return true;
        }
        for (int i=1; i<=c; i++){
            if (isSafe(node, i, graph, colors)){
                colors[node]=i;
                if (graphColoring(node+1, c, graph, colors)){
                    return true;
                }
                colors[node]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int node, int colorIdx, int[][] graph, int[] colors){
        int n = graph.length;
        for (int j=0; j<n; j++){
            if (graph[node][j]==1 && colors[j]==colorIdx){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of nodes in the graph: ");
        int n = sc.nextInt();

        System.out.println("Enter the graph in the form of Adjacency Matrix: ");
        int[][] graph = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                graph[i][j]=sc.nextInt();
            }
        }

        int[] colors = new int[n];
        for (int i=2; i<=n; i++){
            if (graphColoring(0, i, graph, colors)){
                System.out.println(i);
                return;
            }
        }
    }
}
