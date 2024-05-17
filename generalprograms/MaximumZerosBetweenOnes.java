package generalprograms;

public class MaximumZerosBetweenOnes {

    //Maximum 0’s between two immediate 1’s in binary representation
    public static void main(String[] args) {

        String input = Integer.toBinaryString(123222244);
        System.out.println("Input is :" + input);
        getMaxZeroCount(input);
    }

    private static void getMaxZeroCount(String input) {
        int maxZeros = 0;
        int temp = 0;
        String[] inputArray = input.split("");
        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i].equals("0")) {
                temp = temp + 1;
            } else {
                if (temp > maxZeros) {
                    maxZeros = temp;
                }
                temp = 0;
            }
        }
        System.out.println("Max zeros is:" + maxZeros);
    }
}
