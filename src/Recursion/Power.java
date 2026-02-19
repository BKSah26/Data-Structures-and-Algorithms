package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int ans = power(a, b);
        System.out.println(ans);
    }
    public static int power(int a, int b){
        if (b==0){
            return 1;
        }
        int ans = a*power(a, b-1);
        return ans;
    }
}
