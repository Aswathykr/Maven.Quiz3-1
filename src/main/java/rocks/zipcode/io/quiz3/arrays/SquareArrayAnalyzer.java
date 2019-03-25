package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        Arrays.sort(inputArray);
        Arrays.sort(squaredValues);
        Integer[] calculatedSquares = Arrays.stream(inputArray).map(value -> value*value).toArray(Integer[]::new);
        return Arrays.equals(calculatedSquares, squaredValues);
    }
}
