package Backtracking;

import java.util.Scanner;

public class StringPermutations {
    public static void printPermutations(String str, String t){
        if (str.isEmpty()){
            System.out.println(t);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String newStr = left+right;
            printPermutations(newStr, t+ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str, "");
    }
}
