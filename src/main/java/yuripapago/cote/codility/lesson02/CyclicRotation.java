package yuripapago.cote.codility.lesson02;


import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class CyclicRotation {

    //
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

    public int[] solution2(int[] arr, int k) {
        //deque
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
