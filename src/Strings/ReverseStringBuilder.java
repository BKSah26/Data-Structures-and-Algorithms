package Strings;

import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);
        //BuiltIn Function
        //str.reverse();

        //Manual Method
        int i=0, j=s.length()-1;
        while (i<=j){
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(str);
    }
}
