package exercises3;

import java.util.*;

public class SortByValue {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Tuấn Anh",29);
        hashMap.put("Công Phươợng",30);
        hashMap.put("Văn Toàn",28);
        hashMap.put("Quang Hải",27);
        hashMap.put("Hoàng Đức", 29);

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        System.out.println("Sắp xêp phần tử theo thứ tự tăng dần value");
        for (Map.Entry<String,Integer> entry: entryList){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
