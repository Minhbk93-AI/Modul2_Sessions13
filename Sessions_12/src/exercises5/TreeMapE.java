package exercises5;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class TreeMapE {
        public static void main(String[] args) {
            int[] array= new int[10];
            Random random= new Random();
            for (int i=0; i<10;i++){
                array[i] = random.nextInt(100);
            }
            System.out.println("Phần tử của mảng");
            for (int number: array){
                System.out.println(number+" ");
            }
            System.out.println();
            TreeMap<Integer, Integer> map1= new TreeMap<>();
            for (int num: array) {
                map1.put(num,0);
            }
            int minElement = map1.firstKey();
            System.out.println("Phần ử nhỏ nhất trong mảng" +minElement);

            TreeMap<Integer, Integer> map2= new TreeMap<>(Comparator.reverseOrder());
            map2.putAll(map1);
            map2.remove(map2.firstKey());

            int secondLargestElement = map2.firstKey();

            System.out.println("Phần tử lớn thứ hai trong mảng: "+secondLargestElement);
        }
    }

