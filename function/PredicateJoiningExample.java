package function;

import java.util.function.Predicate;

public class PredicateJoiningExample {

    public static void main(String[] args) {
        Predicate<String> s1 = s -> s.length() > 5;
        Predicate<String> s2 = s -> s.length() % 2 == 0;
        System.out.println("Predicate AND :" + s1.and(s2).test("BANGALORE"));
        System.out.println("Predicate OR :" + s1.or(s2).test("CODE WITH ME."));
        //negate case
        System.out.println("Negate : "+s1.negate().test("JAVA PROGRAM"));
    }
}
