package yuripapago.cote.codility.lesson01;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class OddOccurrencesInArrayTest {
    int arr[] = {1, 3, 3, 1, 9};

    @Test
    public void test() {
        OddOccurrencesInArray test = new OddOccurrencesInArray();
        int result = test.solution(arr);

        System.out.print(result);
    }

    @Test
    public void testUseStreamAPI() {
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int result = collect.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(entry -> entry.getKey()).findAny().orElse(0);

        System.out.print(result);
    }
}