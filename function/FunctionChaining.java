package function;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> stringCapital = s -> s.toUpperCase();
        Function<String, Map<String, Long>> count = s -> Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringCapital.andThen(count).apply("bananaananananananananasasasasaanana"));
        System.out.println("**************** compose example ***************");
        Function<Integer, Integer> i1 = i -> i * 2; //double the input
        Function<Integer, Integer> i2 = i -> i * i * i; //cube the input
        System.out.println(i1.compose(i2).apply(3)); // i2 function will be executed first 3*3*3 = 27, and i1 is operated on output of i1. 27 *27
    }
}
