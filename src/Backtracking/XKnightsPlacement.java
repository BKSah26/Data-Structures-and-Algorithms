package Backtracking;

import java.util.Scanner;

public class XKnightsPlacement {
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

    public static void Knights(char[][] board, int row, int col, int num, int x){
        int n = board.length;

        if (row==n){
            if (num==x){
                for (int i=0; i<n; i++){
                    for (int j=0; j<n; j++){
                        System.out.print(board[i][j]+"");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return;
        }

        if (isSafe(board, row, col)){
            board[row][col]='K';
            if (col!=n-1){
                Knights(board, row, col+1, num+1, x);
            }
            else{
                Knights(board, row+1, 0, num+1, x);
            }
            board[row][col]='x';
        }
        if (col!=n-1){
            Knights(board, row, col+1, num, x);
        }
        else{
            Knights(board, row+1, 0, num, x);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of Chess Board: ");
        int n = sc.nextInt();

        System.out.print("Enter the no. of Knights to be placed: ");
        int x = sc.nextInt();

        char[][] board = new char[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j]='x';
            }
        }

        Knights(board, 0, 0, 0, x);
    }
}
