package yuripapago.cote.codility.lesson01;


public class BinaryGap {

    //이진변환후 연속된 0의 개수중 가장 큰 것을 리턴
    public int solution(int num) {
        String s = Integer.toBinaryString(num);
        System.out.println("binary : " + s);

        int count = 0;
        int countTemp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (count < countTemp) {
                    count = countTemp;
                }
                countTemp = 0;
            }
            if (s.charAt(i) == '0') {
                countTemp++;
            }
        }

        return count;

    }
}
