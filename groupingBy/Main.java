package groupingBy;

import java.util.*;
import java.util.stream.Collectors;

public class Main { //first 2 videos code-decode
    public static void main(String[] args) {
        List<E> eList = new ArrayList<E>();
        eList.add(new E("Ravi", 44));
        eList.add(new E("kavya", 22));
        eList.add(new E("Raj", 24));
        eList.add(new E("Ram", 44));
        eList.add(new E("Niraj", 26));

        //GroupingBy 1st Varient
        Map<Integer, List<E>> eMap = eList.
                stream().collect(
                        Collectors.groupingBy(E::getAge));
        // System.out.println(eMap);

        //GroupingBy 2nd varient to eliminate duplicate
        Map<Integer, Set<E>> eSet =
                eList.stream()
                        .collect(Collectors.groupingBy(E::getAge, Collectors.toSet()));
        // System.out.println("Without duplicate age"+ eSet);

        Map<Integer, List<E>> treeMap =
                eList.stream().
                        collect(Collectors.groupingBy(e->e.getAge(), TreeMap::new, Collectors.toList()));

        // System.out.println("Sorted result:" + treeMap);


        //summarystatistics
        List<Integer> ageList = eList.stream()
                .map(e->e.getAge())
                .collect(Collectors.toList());

        IntSummaryStatistics s = ageList.stream().
                mapToInt(x->x).summaryStatistics();

        //System.out.println("Max :"+s.getMax()+ ", Average :"+ s.getAverage());

        //Second and third-youngest employee

        List<Integer> ages = eList.stream()
                .map(E::getAge).toList();

        List<Integer> result = ages.stream().sorted().skip(1)
                .limit(2).toList();

        System.out.println(result);

        //join or concatenate all the employee names
        String s1 = eList.stream().map(E::getName)
                .map(String::toUpperCase)
                .collect(Collectors.joining(",  "));

        System.out.println(s1);
    }
}


class E{
    private String name;
    private Integer age;

    public E(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "name :" + name + ", Age :"+ age;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;

        if(null == o || o.getClass() != this.getClass()) return false;


        E emp = (E) o;
        return (emp.getAge() == age);
    }

    @Override
    public int hashCode(){
        return this.age;
    }
}