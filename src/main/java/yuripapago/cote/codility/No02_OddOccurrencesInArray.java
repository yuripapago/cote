package yuripapago.cote.codility;



import java.util.HashSet;
import java.util.Set;

public class No02_OddOccurrencesInArray {

    public void test() {
        int test[] = {1, 3, 3, 1, 9};
        int solution = this.solution(test);
        System.out.print(solution);
    }

    public int solution(int[] arr) {

        //lambda group by
        /*
        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int result = collect.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .map(entry -> entry.getKey()).findAny().orElse(0);
        return result;
            */

        //set
        Set<Integer> data = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (data.contains(arr[i])) {
                data.remove(arr[i]);
            } else {
                data.add(arr[i]);
            }
        }
        return data.iterator().next();

    }
}
