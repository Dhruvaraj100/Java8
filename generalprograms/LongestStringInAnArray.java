package generalprograms;

import java.util.Arrays;
import java.util.Comparator;

public class LongestStringInAnArray {

    public static void main(String[] args) {
        // Length of Longest string in an array
        String[] s = {"apple", "orange", "pineapple","jackfuit", "cherry", "kiwi","watermelon"};

        String longestString = Arrays.stream(s) .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longestString);
    }
}
