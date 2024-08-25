package exercises4;

import java.util.HashMap;

public class CheckElementInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 10);
        map.put("E", 40);


        String keyToCheck = "C";

        if (map.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " Phần tử tồn tại trong HashMap ");
        } else {
            System.out.println(keyToCheck + "Phần tử không tồn tại trong HashMap ");
        }
    }
}
