package hbcu.stay.ready.algorithms;

import java.util.Arrays;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        return null;
    }

    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input){
        Arrays.sort(input);

        int duplicates = 0;
        Integer currentValue = null;
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(currentValue) && input[i].equals(input[i + 1])) {
                duplicates++;
                currentValue = input[i];
            }
        }
        return duplicates;
    }
}
