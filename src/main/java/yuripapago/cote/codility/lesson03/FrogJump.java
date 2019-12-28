package yuripapago.cote.codility.lesson03;


public class FrogJump {

    //출발지에서 목적지까지 일정거리만큼 점프하였을때 몇번을 점프해야 갈 수 있는지
    //https://app.codility.com/demo/results/trainingNDGH2U-NZD/
    public int solution(int x, int y, int d) {
        if (x == y) {
            return 0;
        }

        int distance = (y - x);
        if (distance <= d) {
            return 1;
        }

        return distance % d == 0 ? distance / d : (distance / d) + 1;
    }


}
