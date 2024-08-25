package exercises1;

import java.util.HashMap;
import java.util.Map;

public class ElementCount {
    public static void main(String[] args) {
        int[] numbers={1,2,5,13,24,5,6,6,1,23,3,54,6};

        HashMap<Integer, Integer> elementMap = new HashMap<>();
        for (int number: numbers){
            if (elementMap.containsKey(number)){
                elementMap.put(number,elementMap.get(number)+1);
            }else {
                elementMap.put(number,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: elementMap.entrySet()){
            System.out.println("Element "+ entry.getKey()+" có value "+ entry.getValue());
        }
    }
}
