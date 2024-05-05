import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "asdasaddaaffaghkashgdkgfusdhgfuysd nni1221121nbfksbdfkbsdfjkbksjdasjdfvwxTtt";

        Map<String, Long> result = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
