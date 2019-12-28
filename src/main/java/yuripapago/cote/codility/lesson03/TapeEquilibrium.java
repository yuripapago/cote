package yuripapago.cote.codility.lesson03;


public class TapeEquilibrium {

       /*
       주어진 배열을 순차적으로 합산하여 절대값 차이가 가장 작은 값을 찾는 문제
       [3, 1, 2, 3, 4]
       | 3 - 10 | = 7
       | 4 - 9  | = 5
       | 6 - 7  | = 1 <-
       | 9 - 4  | = 5
       */
    //https://app.codility.com/demo/results/trainingGUWCP6-V6V/
    public int solution(int[] arr) {
        int forwardSum = 0;
        int backwardSum = 0;
        int result = Integer.MAX_VALUE;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            backwardSum += arr[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            forwardSum += arr[i];
            backwardSum -= arr[i];
            tmp = Math.abs(forwardSum - backwardSum);

            if (result > tmp) {
                result = tmp;
            }

        }
        return result;
    }
}
