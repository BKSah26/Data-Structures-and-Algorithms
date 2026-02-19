package Recursion;

import java.util.Scanner;

public class PowerWithLogarithmicTimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();

        System.out.println(power(a, b));
    }

    public static int power(int a, int b){
        if (b==0){
            return 1;
        }
        else if (b%2==0){
            int ans = power(a, b/2)*power(a, b/2);
            return ans;
        }
        else{
            int ans = power(a, b/2)*power(a, b/2)*a;
            return ans;
        }
    }
}
