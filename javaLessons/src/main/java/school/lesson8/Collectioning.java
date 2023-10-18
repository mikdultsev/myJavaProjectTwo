package school.lesson8;

import java.util.*;

public class Collectioning {
    public static void main(String[] args) {
       String [] arr = {"apple", "banana", "apple", "orange", "banana", "apple", "grape", "orange"};

        Set<String> set = new HashSet<>(Arrays.asList(arr));

               System.out.println(set);

        Map<String, Integer> wordcountmap = new HashMap<>();
        for(String word: arr) {
            Integer count = wordcountmap.getOrDefault(word, 0);
            wordcountmap.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> entry : wordcountmap.entrySet()){
          String word = entry.getKey();
          Integer count = entry.getValue();
            System.out.println(word + ": "  + count);
        }
    }
    }
