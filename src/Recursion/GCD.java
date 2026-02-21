package Recursion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        int hcf = gcd(a, b);
        System.out.println(hcf);
    }
}
