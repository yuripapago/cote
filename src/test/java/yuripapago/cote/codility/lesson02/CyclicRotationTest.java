package yuripapago.cote.codility.lesson02;

import org.junit.Test;
import yuripapago.cote.codility.lesson02.CyclicRotation;

/**
 * Created by heesu on 2019-12-21.
 */
public class CyclicRotationTest {
    int arr[] = {3, 8, 9, 7, 6};
    int k = 3;

    @Test
    public void testSolution() {
        CyclicRotation test = new CyclicRotation();
        int[] solution = test.solution(arr, k);
        System.out.print(solution);

    }


    @Test
    public void testSolution2() {
        CyclicRotation test = new CyclicRotation();
        int[] solution2 = test.solution2(arr, k);
        System.out.print(solution2);


    }

}