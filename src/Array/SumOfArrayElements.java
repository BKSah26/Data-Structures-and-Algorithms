package Array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 3, 7};
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array Elements: "+sum);
    }
}
