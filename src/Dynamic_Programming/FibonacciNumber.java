package Dynamic_Programming;

import java.util.Scanner;

public class FibonacciNumber {
    static int[] dp;
    public static int FibonacciSeries(int n){
        if (n<=1){
            return n;
        }
        if (dp[n]!=0){
            return dp[n];
        }
        int ans = FibonacciSeries(n-1)+FibonacciSeries(n-2);
        dp[n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which term of Fibonacci Series is to be found: ");
        int n = sc.nextInt();
        dp = new int[n+1];
        int ans = FibonacciSeries(n);
        System.out.println(ans);
    }
}
