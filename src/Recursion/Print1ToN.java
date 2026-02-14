package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        print(1, n);
    }
    public static void print(int x, int n){
        if (x>n){
            return;
        }
        System.out.println(x);
        print(x+1, n);
    }
}
