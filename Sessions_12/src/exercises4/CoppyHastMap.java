package exercises4;
import java.util.HashMap;
public class CoppyHastMap {
        public static void main(String[] args) {

            HashMap<String, Integer> originalMap = new HashMap<>();
            originalMap.put("Minh", 50);
            originalMap.put("Ánh", 20);
            originalMap.put("Nguyễn", 30);
            originalMap.put("A", 10);
            originalMap.put("Mango", 40);

            HashMap<String, Integer> copiedMap = new HashMap<>();

            copiedMap.putAll(originalMap);


            System.out.println("Original HashMap: " + originalMap);
            System.out.println("Copied HashMap: " + copiedMap);
        }
    }


