package Strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean val = true;
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int i = 0, j = str.length()-1;
        while (i<=j){
            if (str.charAt(i)!=str.charAt(j)){
                val = false;
                break;
            }
            i++;
            j--;
        }

        if (val == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
