package Strings;

import java.util.Scanner;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s=s.trim().replaceAll("\\s+", " ");

        StringBuilder str = new StringBuilder(s);
        int i=0, j=0, k=0;
        int n = s.length();
        while (k<n){
            if (s.charAt(k)==' '){
                j = k-1;
                while (i<j){
                    char ch1 = str.charAt(i);
                    char ch2 = str.charAt(j);
                    str.setCharAt(i, ch2);
                    str.setCharAt(j, ch1);
                    i++;
                    j--;
                }
                i=k+1;
            }
            k++;
        }
        j=n-1;
        while (i<j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            str.setCharAt(i, ch2);
            str.setCharAt(j, ch1);
            i++;
            j--;
        }
        String newstr = str.toString();
        System.out.println(newstr);
    }
}
