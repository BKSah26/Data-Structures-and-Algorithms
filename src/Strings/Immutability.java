package Strings;

public class Immutability {
    public static void main(String[] args) {
        String str = "Aathish";
        //Individual characters of a string cannot be changed.
        //However, the change like the one below can be made.
        str = str.substring(0, 2)+'s'+str.substring(3);
        System.out.println(str);
    }
}
