package stringOperations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "mango", "cherry", "apple", "cherry", "banana", "Kiwi", "apple");

        Set<String> uniqueFruits = new HashSet<String>();
        Set<String> t = names.stream().filter(x->!uniqueFruits.add(x)).collect(Collectors.toSet());
        System.out.println("Duplicate fruits =" + t);
        System.out.println("Non duplicate fruits =" + uniqueFruits);

        //Second approach
        Map<String, Long> r = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Result is ="+ r);

        List<String> dupli =r.entrySet().stream().filter(es -> es.getValue()>1).map(Map.Entry::getKey).toList();

        System.out.println("Repeated string is =" + dupli);

        //Third way
        Set<String> res = names.stream().filter(n-> Collections.frequency(names, n)>1)
                .collect(Collectors.toSet());
        System.out.println("Repeated string is =" + res);
    }
}
