package hbcu.stay.ready.algorithms;

import java.util.*;

public class HashMapImplementation {

    public Integer countDuplicates(String[] input){

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            String value = input[i];
            if (hashMap.containsKey(value)) {
                int timesInHashMap = hashMap.get(value);
                timesInHashMap++;
                hashMap.put(value, timesInHashMap);
            } else {
                hashMap.put(value, 1);
            }
        }

        int duplicates = 0;
        for (String s1 : hashMap.keySet()) {
            if (hashMap.get(s1) > 1) {
                duplicates++;
            }
        }

        return duplicates;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        // First <Integer> for the input index, second <Integer> for the times it was detected in the loop.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(input[i])) {
                int timesInMap = map.get(input[i]);
                timesInMap++;
                map.put(input[i], timesInMap);
            } else {
                map.put(input[i], 1);
            }
        }

        int duplicates = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicates++;
            }
        }
        return duplicates;
    }

    // Use generic array so that String[] and Integer[] can both call this method.
    // (I'm now realizing it would be simpler to just pass the length of the array as a parameter but I don't get to work with generics much so here it stays.)
    private <T> boolean indexInRange(T[] array, int index) {
        if (index > array.length - 1) {
            return false;
        }
        return true;
    }
}
