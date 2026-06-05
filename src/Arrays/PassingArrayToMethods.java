package Array;

public class PassingArrayToMethods {
    public static void change(int[] array, int index){
        array[index] = 69;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 12, 21};
        for (int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        change(arr, 2);
        for (int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
