package Array;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 1, 2, 9, 5, 7};
        int n = arr.length;

        int max = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest Element: " + max);
    }
}
