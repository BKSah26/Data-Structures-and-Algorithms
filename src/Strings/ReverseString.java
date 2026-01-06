package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String newstr = "";
        int i = str.length()-1;
        while (i>=0){
            newstr+=str.charAt(i);
            i--;
        }
        System.out.println("Reversed string: "+newstr);
    }
}
