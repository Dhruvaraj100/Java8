package groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByExample {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "banana", "apple", "banana", "pineapple", "pineapple", "water melon");
        Map<String, Long> fruitsMap = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(fruitsMap);

        System.out.println("***************** groupingBy.Fruit *****************");

        List<Fruit> fruitList = Arrays.asList(new Fruit("apple", 100, 2), new Fruit("banana", 30, 4), new Fruit("pineapple", 50, 8), new Fruit("apple", 100, 22), new Fruit("banana", 30, 4));
        Map<String, Long> fruitMap = fruitList.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        System.out.println("Number of fruit objects in the list: "+  fruitMap);

        Map<String, Integer> fruitMap1 = fruitList.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQuantity)));
        System.out.println("Sum of quantity of each fruit :" + fruitMap1);
    }
}

class Fruit {
    private String name;
    private Integer price;
    private Integer quantity;

    public Fruit(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
