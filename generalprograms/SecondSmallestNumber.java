package generalprograms;

import java.util.Arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] input = new int[]{5, 199, 8, 3, 1};
        findSecondSmallestNumber(input);
    }

    private static void findSecondSmallestNumber(int[] input) {
        int optionalInt = Arrays.stream(input).distinct().sorted().skip(1).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There is no second smallest number"));
        System.out.println(optionalInt);
    }
}
