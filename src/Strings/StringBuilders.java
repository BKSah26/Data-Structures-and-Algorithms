package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(6);
        System.out.println("Length of String Builder: "+str.length());
        System.out.println("Capacity of String Builder: "+str.capacity());

        str.append("Aathish");
        System.out.println(str);
        System.out.println("Length of String Builder: "+str.length());
        System.out.println("Capacity of String Builder: "+str.capacity());
        //The capacity of the String Builder increases once new things are appended in the String Builder.

        str.setCharAt(2, 's');
        System.out.println(str);
        //String Builder are mutable, unlike Strings. Hence, individual characters can be modified.
    }
}
