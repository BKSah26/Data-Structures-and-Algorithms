package Array;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 1};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    //This creates only a copy of array elements.
    //Hence, it cannot be used to modify elements.
}
