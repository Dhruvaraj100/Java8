package function;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> str = s -> s.length() > 5;
        System.out.println("Is input greater than 5 :" + str.test("Test123"));

        Predicate<Integer> i = input -> input % 2 == 0;
        System.out.println("Is number even :"+ i.test(13));
    }
}
