package yuripapago.cote.codility;


public class No01_BinaryGap {

    public static void main(String[] args) {
        int solution = solutionByBinaryTransform(1041);
        System.out.print(solution);
    }


    public static int solutionByBinaryTransform(int num) {
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
