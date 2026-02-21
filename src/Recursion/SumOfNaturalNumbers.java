package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no upto which sum is to be found: ");
        int n = sc.nextInt();

        int s = sum(n);
        System.out.println("Sum: "+s);
    }
}
