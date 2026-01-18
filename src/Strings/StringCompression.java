package Strings;

public class StringCompression {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'b', 'b', 'c', 'c', 'c', 'd', 'd'};

        int i=0, index=0;
        while (i<arr.length){
            char current = arr[i];
            int count = 0;

            while (i<arr.length && arr[i]==current){
                i++;
                count++;
            }
            arr[index++]=current;

            if (count>1){
                for (char c: String.valueOf(count).toCharArray()){
                    arr[index++]=c;
                }
            }
        }

        for (char c : arr){
            System.out.print(c+" ");
        }
        System.out.println();

        System.out.println("Array Length: "+index);
    }
}
