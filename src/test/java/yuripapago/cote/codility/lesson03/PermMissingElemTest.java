package yuripapago.cote.codility.lesson03;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class PermMissingElemTest {

    int a[] = {3, 2, 1, 5};
    int b[] = {};
    int c[] = {2};

    @Test
    public void test() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int solution = permMissingElem.solution(a);
        System.out.println(solution);
        Assert.assertTrue(solution == 4);
    }

    @Test
    public void test2() {
        PermMissingElem permMissingElem = new PermMissingElem();
        int solution = permMissingElem.solution(c);
        System.out.println(solution);
        Assert.assertTrue(solution == 1);
    }
}