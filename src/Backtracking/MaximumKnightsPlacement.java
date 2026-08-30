package Backtracking;

import java.util.Scanner;

public class MaximumKnightsPlacement {
    static int maxKnights = -1;
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        int i, j;
        // 2 Up 1 Right
        i = row-2;
        j = col+1;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Up 1 Left
        i = row-2;
        j = col-1;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Down 1 Right
        i = row+2;
        j = col+1;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Down 1 Left
        i = row+2;
        j = col-1;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Right 1 Up
        i = row-1;
        j = col+2;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Right 1 Down
        i = row+1;
        j = col+2;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Left 1 Up
        i = row-1;
        j = col-2;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        // 2 Left 1 Down
        i = row+1;
        j = col-2;
        if ((i>=0 && i<n) && (j>=0 && j<n) && board[i][j]=='K'){
            return false;
        }

        return true;
    }

    public static void Knights(char[][] board, int row, int col, int num){
        int n = board.length;

        if (row==n){
            maxKnights = Math.max(maxKnights, num);
            return;
        }

        if (isSafe(board, row, col)){
            board[row][col]='K';
            if (col!=n-1){
                Knights(board, row, col+1, num+1);
            }
            else{
                Knights(board, row+1, 0, num+1);
            }
            board[row][col]='x';
        }
        if (col!=n-1){
            Knights(board, row, col+1, num);
        }
        else{
            Knights(board, row+1, 0, num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of Chess Board: ");
        int n = sc.nextInt();

        char[][] board = new char[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]='x';
            }
        }

        Knights(board, 0, 0, 0);
        System.out.println("Maximum No. of Knights that can be placed: "+maxKnights);
    }
}
