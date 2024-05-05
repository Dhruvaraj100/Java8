package function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> square = i -> i * i;
        System.out.println("Square of inout is :" + square.apply(25));
        Function<String, Integer> length = i -> i.length();
        System.out.println("Length of inout is :" + length.apply("Bangalore"));
    }
}
