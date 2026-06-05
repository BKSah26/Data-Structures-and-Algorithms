package Array;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 3, 7};
        int n = arr.length;
        int product = 1;
        for (int i=0; i<n; i++){
            product*=arr[i];
        }
        System.out.println("Product of Array Elements: "+product);
    }
}
