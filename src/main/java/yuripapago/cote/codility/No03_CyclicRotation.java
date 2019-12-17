package yuripapago.cote.codility;


import java.util.Arrays;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class No03_CyclicRotation {

    public void test() {
        int test[] = {3, 8, 9, 7, 6};
        int[] solution = this.solution2(test, 3);
        int[] solution2 = this.solution2(test, 3);

        Arrays.stream(solution).boxed().forEach(System.out::println);
    }


    //큐와 데큐에 대해서 더 공부해보자
    public int[] solution(int[] arr, int k) {
        if (arr == null) {
            int empty[] = {};
            return empty;
        }
        if (k == 0) {
            return arr;
        }

        int[] ret = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int idx = (i + k) % arr.length;
            ret[idx] = arr[i];
        }

        return ret;


    }

    //deque
    public int[] solution2(int[] arr, int k) {
        if (arr == null) {
            int empty[] = {};
            return empty;
        }
        if (k == 0) {
            return arr;
        }

        //deque
        BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        for (int r = 0; r < k; r++) {
            Integer peek = queue.pollLast();
            queue.addFirst(peek);
        }

        return queue.stream().mapToInt(q -> Integer.valueOf(q)).toArray();


    }
}
