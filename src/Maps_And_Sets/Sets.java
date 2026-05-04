package Maps_And_Sets;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(44);
        set.add(14);
        set.add(15);
        set.add(97);
        set.add(26);
        set.add(18);

        System.out.println(set.size());
        System.out.println(set.contains(15));
        System.out.println(set.contains(17));
        set.remove(15);
        System.out.println(set.contains(15));

        System.out.println(set);

        //Iteration
        for (int ele : set){
            System.out.println(ele);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        //Tree set is an ordered set
        treeSet.add(15);
        treeSet.add(17);
        treeSet.add(21);
        treeSet.add(44);
        treeSet.add(14);
        treeSet.add(11);

        System.out.println(treeSet);
    }
}
