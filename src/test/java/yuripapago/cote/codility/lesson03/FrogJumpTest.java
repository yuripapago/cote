package yuripapago.cote.codility.lesson03;

import org.junit.Test;


public class FrogJumpTest {


    @Test
    public void test() {
        FrogJump frogJump = new FrogJump();
        int solution = frogJump.solution(10, 80, 30);
        System.out.println(solution);

        solution = frogJump.solution(0, 80, 30);
        System.out.println(solution);
    }
}