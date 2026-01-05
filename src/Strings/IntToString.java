package Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        //Method 1
        String s1 = "";
        s1 +=n;
        System.out.println(s1);

        String s2 = Integer.toString(n);
        System.out.println(s2);
    }
}
