package Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class FourDirectionMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        boolean[][] isVisited = new boolean[rows][cols];
        String ans = "";
        printPath(0, 0, rows-1, cols-1, ans, isVisited);
    }

    public static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] arr){
        if (sr<0 || sc<0){
            return;
        }
        if (sr>er || sc>ec){
            return;
        }
        if (arr[sr][sc]==true) {
            return;
        }
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        arr[sr][sc]=true;
        printPath(sr+1, sc, er, ec, s+"D", arr);
        printPath(sr, sc+1, er, ec, s+"R", arr);
        printPath(sr-1, sc, er, ec, s+"U", arr);
        printPath(sr, sc-1, er, ec, s+"L", arr);
        arr[sr][sc]=false;
    }
}
