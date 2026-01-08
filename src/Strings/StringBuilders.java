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

        //String Builders to Strings
        String newstr = str.toString();
        System.out.println(newstr);

        //String to String Builder
        String s = "Devesh";
        StringBuilder strbuilder = new StringBuilder(s);
        System.out.println(strbuilder);

        //Delete a Character
        strbuilder.deleteCharAt(5);
        System.out.println(strbuilder);

        //Insert a Character
        strbuilder.insert(5, 'h');
        System.out.println(strbuilder);

        //Deleting a substring
        strbuilder.delete(3, 6);
        System.out.println(strbuilder);
    }
}
