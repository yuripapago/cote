package yuripapago.cote.codility.lesson02;


import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {


    public int solution(int[] arr) {

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
