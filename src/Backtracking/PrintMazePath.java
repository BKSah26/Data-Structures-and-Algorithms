package Backtracking;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String ans = "";

        System.out.println("Possible Ways: ");
        printMaze(1, 1, rows, cols, ans);
    }

    public static void printMaze(int sr, int sc, int er, int ec, String s){
        if ((sr>er) || (sc>ec)){
            return;
        }
        if (sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        printMaze(sr+1, sc, er, ec, s+"D");
        printMaze(sr, sc+1, er, ec, s+"R");
    }
}
