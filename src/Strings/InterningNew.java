package Strings;

public class InterningNew {
    public static void main(String[] args) {
        String s = "Aatish";
        System.out.println(s);
        String t = "Aatish";   //Here, t is also pointing at the same space in the memory where "Aatish" is stored.
        System.out.println(t);
        String q = new String("Aatish");    //This creates a new String in the memory, although the content same as the above two strings.
        System.out.println(q);
    }
}
