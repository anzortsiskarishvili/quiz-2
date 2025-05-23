package oop.q2;
import java.util.List;
import java.util.Arrays;
/**
 * This program maps numeric values from one list to corresponding string values in another list
 * using a specific index transformation rule (2n-1). It demonstrates how to transform indices
 * between two lists to generate a desired output sequence.
 * <p>The program solves the following problem:
 * Given two lists:
 * - List1: Contains integers representing transformed indices
 * - List2: Contains strings to be selected based on List1's values
 * The output is generated by selecting elements from List2 at positions calculated as (2 * n - 1)
 * for each value n in List1.
 * <p><b>Example:</b>
 * For List1 value 6: 2*6-1 = 11 → List2[11] = "N1w"
 * @author Anzor Tsiskarishvili
 */
public class Main {
    /**
     * The main method that executes the list mapping logic.
     *
     * <p><b>Algorithm:</b>
     * 1. Initialize two lists:
     *    - list1: Source integers for index calculation
     *    - list2: Target strings for selection
     * 2. For each integer in list1:
     *    a. Calculate target index as (2 * n - 1)
     *    b. Retrieve corresponding string from list2
     *    c. Print the result
     */
    public static void main(String[] args) {
        // Source list of integers for index calculation
        List<Integer> list1 = Arrays.asList(6, 4, 5, 4, 7, 9, 2, 2, 7, 7, 8, 2, 9);

        // Target list of strings for selection
        List<String> list2 = Arrays.asList(
                "Q7Zm", "D7PP", "SY5t", "ZdI", "Ldt", "pqTIo", "dXQ", "lNU",
                "ZXKSj", "x6r8N", "rqr", "N1w", "6LZ", "G2eM6", "uaLm", "rjZ",
                "yMxxE", "qBEL"
        );

        System.out.println("Output:");
        for (int n : list1) {
            // Calculate target index and retrieve corresponding string
            String result = list2.get(2 * n - 1);
            System.out.println(result);
        }
    }
}
