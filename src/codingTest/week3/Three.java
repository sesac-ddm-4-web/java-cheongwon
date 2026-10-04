package codingTest.week3;
import java.util.*;

// 3. 주식가격
public class Three {
    public int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<prices.length; i++){
            int time = 0;
            for(int j=i+1; j<prices.length; j++){
                time++;
                if(prices[i]>prices[j]) break;//가격이 떨어지면 멈춤
            }
            list.add(time);//해당 시간을 답에 저장
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
