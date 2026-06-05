package Array;

import java.util.ArrayList;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;
        for (int i = arr.size()-1; i>=0; i--){
            int sum = arr.get(i)+carry;
            if (sum<10){
                ans.add(sum);
                carry=0;
            }
            else {
                ans.add(0);
                carry=1;
            }
        }
        if (carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
