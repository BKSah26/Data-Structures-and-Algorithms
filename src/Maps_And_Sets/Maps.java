package Maps_And_Sets;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Bipin", 20);
        map.put("Amit", 23);
        map.put("Deepika", 35);
        map.put("Ramesh", 40);
        map.put("Bhuvneshwar", 36);

        System.out.println(map);
        System.out.println(map.size());

        map.remove("Amit");
        System.out.println(map);

        System.out.println(map.get("Bhuvneshwar"));

        System.out.println(map.containsKey("Bipin"));
        System.out.println(map.containsKey("Pratap"));

        //Iteration
        for (String key : map.keySet()){
            System.out.println(key);
        }
        for (int ele : map.values()){
            System.out.println(ele);
        }

        for (String key: map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
}
