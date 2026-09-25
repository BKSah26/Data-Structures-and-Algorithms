package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class GraphColoring {
    public static void graphColoring(int node, int[][] graph, char[] colors, char[] nodeColors){
        int n = graph.length;
        int m = colors.length;
        for (int i=0; i<m; i++){
            if (isSafe(node, colors[i], graph, nodeColors)){
                nodeColors[node] = colors[i];
                if ((node+1)<n){
                    graphColoring(node+1, graph, colors, nodeColors);
                }
                else{
                    for (int j=0; j<n; j++){
                        System.out.print(nodeColors[j]+" ");
                    }
                    System.out.println();
                    return;
                }
                nodeColors[node]='0';
            }
        }
    }

    public static boolean isSafe(int node, char color, int[][] graph, char[] nodeColors){
        int n = graph.length;
        for (int j=0; j<n; j++){
            if (graph[node][j]==1 && nodeColors[j]==color){
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

        System.out.print("Enter the no. of colours: ");
        int cols = sc.nextInt();
        char[] colors = new char[cols];
        System.out.println("Enter the names of the colors: ");
        for (int i=0; i<cols; i++){
            colors[i]=sc.next().charAt(0);
        }

        char[] nodeColors = new char[n];
        Arrays.fill(nodeColors, '0');
        graphColoring(0, graph, colors, nodeColors);
    }
}
