package Recursion;

import java.util.Scanner;

public class ReverseOfANumber {
    public static int reverse(int n, int r){
        if (n==0){
            return r;
        }
        return reverse(n/10, r*10+n%10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no: ");
        int n = sc.nextInt();
        int r = 0;
        int rev = reverse(n, r);
        System.out.println("Reverse: "+rev);
    }
}
