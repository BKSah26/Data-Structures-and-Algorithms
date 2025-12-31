package Array;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i=0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        char[] ch = new char[10];
        for (int i=0; i<10; i++){
            System.out.print((char)arr[i]+" ");
        }
        System.out.println();
    }
}
