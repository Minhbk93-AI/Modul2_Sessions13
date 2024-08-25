package exercises2;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers= {1, 5, 8, 1, 9, 4, 5, 6, 4, 9};
        HashMap<Integer,Integer> elementCountMap= new HashMap<>();
        for (int number: numbers){
            if (elementCountMap.containsKey(number)){
                elementCountMap.put(number, elementCountMap.get(number)+1);
            }else {
                elementCountMap.put(number,1);
            }
        }
        List<Integer> uniqueElement= new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: elementCountMap.entrySet()) {
        if (entry.getValue()==1){
            uniqueElement.add(entry.getKey());
        }
        }
        System.out.println("Phân tử duy nhất trong manảng là: "+uniqueElement);
    }

}
