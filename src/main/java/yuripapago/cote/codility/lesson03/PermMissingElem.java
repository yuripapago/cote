package yuripapago.cote.codility.lesson03;


import java.util.Arrays;

public class PermMissingElem {


    //1부터 시작하는 연속된 배열에서 빠진 숫자가 있다면 리턴
    //https://app.codility.com/demo/results/trainingZ4YC32-MG8/
    public int solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }
}
