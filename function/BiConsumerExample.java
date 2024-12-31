package function;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    // BiConsumer is a functional interface that accepts 2 inputs and returns nothing.
    // It has one abstract metod called "accept"
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> sum = (a, b) -> System.out.println(a + b);
        sum.accept(10, 18);
    }
}
