package yuripapago.cote.codility.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class BinaryGapTest {

    @Test
    public void testSolution() {
        BinaryGap test = new BinaryGap();
        int solution = test.solution(11);

        System.out.println(solution);
        Assert.assertTrue(solution == 1);
    }


    @Test
    public void testBinary() {
        int data = 10;
        int remain = 0;
        
        List<Integer> arr = new ArrayList<>();

        while (data > 0) {
            remain = data % 2;
            data = data / 2;
            arr.add(remain);
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
    }

}