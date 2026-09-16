package codingTest.week1;

import java.util.*;
//3. 같은 숫자는 싫어
public class Three {
    public int[] solution(int []arr) {
        //arr은 0~9
        int prev = -1;
        List<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(num != prev) list.add(num);
            prev = num;
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
