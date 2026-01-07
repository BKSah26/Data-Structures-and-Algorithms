package Strings;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Aatish";
        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
