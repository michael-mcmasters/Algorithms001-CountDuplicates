package hbcu.stay.ready.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input){
        //Arrays.asList(input).forEach(System.out::println);
        //int[] myIntArray = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(input);

        int duplicates = 0;
        String currentValue = null;
        for (int i = 0; i < input.length; i++) {
            if (indexInRange(input, i + 1)) {
                String nextStr = input[i + 1];
                if (!input[i].equals(currentValue) && input[i].equals(nextStr)) {
                    duplicates++;
                    currentValue = input[i];
                }
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
        Arrays.sort(input);

        int duplicates = 0;
        Integer currentValue = null;
        for (int i = 0; i < input.length; i++) {
            if (indexInRange(input, i + 1)) {
                int nextInt = input[i + 1];
                if (!input[i].equals(currentValue) && input[i].equals(nextInt)) {
                    duplicates++;
                    currentValue = input[i];
                }
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
