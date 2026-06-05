package Two_Dimensional_Array;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};

        //Method 1
        System.out.println("Method 1:");
        for (int i=0; i<arr.length; i++){
            for (int ele : arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        //Method 2
        System.out.println("Method 2:");
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
