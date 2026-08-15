package Backtracking;

import java.util.Scanner;

public class MazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int count = maze(1, 1, rows, cols);
        System.out.println("Total Ways: "+ count);
    }

    public static int maze(int sr, int sc, int er, int ec){
        if (sr>er || sc>ec){
            return 0;
        }
        if (sr == er && sc == ec){
            return 1;
        }
        int downways = maze(sr+1, sc, er, ec);
        int rightways = maze(sr, sc+1, er, ec);
        return downways+rightways;
    }
}
