package Array;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 7, 9, 6};
        int n = arr.length+1;
        long arrsum = 0;
        for (int i=0; i<arr.length; i++){
            arrsum +=arr[i];
        }
        long sum = n*(n+1)/2;
        long missing_num = sum-arrsum;
        System.out.println("Missing Number: "+ missing_num);
    }
}
