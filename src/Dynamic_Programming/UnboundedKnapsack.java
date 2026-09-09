package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class UnboundedKnapsack {
    public static int Knapsack(int i, int[] wt, int[] pf, int C, int[][] dp){
        if (i==wt.length){
            return 0;
        }
        if (dp[i][C]!=-1){
            return dp[i][C];
        }
        int skip = Knapsack(i+1, wt, pf, C, dp);
        if (wt[i]>C){
            dp[i][C] = skip;
            return skip;
        }
        int take = pf[i]+Knapsack(i, wt, pf, C-wt[i], dp);
        dp[i][C] =Math.max(take, skip);
        return Math.max(take, skip);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of items: ");
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] pf = new int[n];

        System.out.println("Enter the weight and profit of the items: ");
        for (int i=0; i<n; i++){
            wt[i] = sc.nextInt();
            pf[i] = sc.nextInt();
        }

        System.out.print("Enter the capacity of the Knapsack: ");
        int C = sc.nextInt();

        int[][] dp = new int[n][C+1];
        for (int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        int maxProfit = Knapsack(0, wt, pf, C, dp);
        System.out.println("Maximum Profit: "+maxProfit);
    }
}