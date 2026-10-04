package codingTest.week3;
import java.util.*;

// 2. 다리를 지나는 트럭
public class Two {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        int answer = 0;//시간
        int currentWeight = 0;//현재 다리 위 무게
        int currentIndex = 0;//truck_weights의 index
        while (true) {
            answer++;//시간 1 흐름
            if (answer > bridge_length) {//차량이 다리에서 나가기 시작하는 때
                int temp = queue.poll();//queue에서 pop해서
                currentWeight -= temp;//현재 다리위 무게 감소
            }
            if (currentIndex == truck_weights.length && queue.isEmpty()) {
                break;//차량을 모두 보내고, queue 즉 다리위에 차량이 남아있지 않다면 종료
            }
            //아직 차량을 모두 보내지 않았고, 다리위에 차량을 보낼 수 있으면
            if ((currentIndex < truck_weights.length)
                    && (currentWeight + truck_weights[currentIndex] <= weight)) {
                queue.offer(truck_weights[currentIndex]);//다리 위로 올리고
                currentWeight += truck_weights[currentIndex];//무게 올리고
                currentIndex++;//인덱스 증가
            } else if (currentIndex < truck_weights.length) {
                queue.offer(0);//이번에는 차량을 보낼 수 없을때는 0을 넣음
            }
        }
        return answer;
    }
}
