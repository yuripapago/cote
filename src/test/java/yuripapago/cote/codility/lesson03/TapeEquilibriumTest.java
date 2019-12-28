package yuripapago.cote.codility.lesson03;

import org.junit.Assert;
import org.junit.Test;


public class TapeEquilibriumTest {
    int a[] = {3, 1, 2, 4, 3};

    int b[] = {1, 1, 3};

    int c[] = {-1000, 1000};

    @Test
    public void test() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int solution = tapeEquilibrium.solution(a);
        System.out.println(solution);
        Assert.assertTrue(solution == 1);
    }

    @Test
    public void testb() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int solution = tapeEquilibrium.solution(b);
        System.out.println(solution);
        Assert.assertTrue(solution == 1);
    }

    @Test
    public void testc() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int solution = tapeEquilibrium.solution(c);
        System.out.println(solution);
        Assert.assertTrue(solution == 2000);
    }
}