package Strings;

import java.util.Scanner;

public class CompareTo {
    public static int compare(String s1, String s2){
        int min_val = Math.min(s1.length(), s2.length());
        int val = 0;
        int i=0;
        while (i< min_val){
            if (s1.charAt(i)!=s2.charAt(i)){
                val = (int)s1.charAt(i)-(int)s2.charAt(i);
                break;
            }
            else if (s1.charAt(i)==s2.charAt(i)){
                i++;
            }
        }
        if (i==min_val){
            val = s1.length()-s2.length();
        }

        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        String str2 = sc.nextLine();

        int comp = compare(str1, str2);
        System.out.println(comp);
    }
}
