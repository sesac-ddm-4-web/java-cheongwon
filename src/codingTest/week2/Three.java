package codingTest.week2;

import java.util.*;

public class Three {
    public int solution(int[] priorities, int location) {
        List<Integer> prior = new ArrayList<>();
        for(int i : priorities){
            prior.add(i);
        }
        Collections.sort(prior,Collections.reverseOrder());// ArrayList에 담고, 중요도 높은순으로 정렬
        List<Integer> answers = new ArrayList<>(); // 실행된 순서대로 a-0, b-1,.. 매칭되는 값 넣어주기 위함
        int taskNum = priorities.length;
        int cnt = 0;
        int ptr = 0;
        while(true){
            if(taskNum == cnt) break;
            if(priorities[ptr] == prior.get(cnt)){//현재 가장 높은 우선순위
                answers.add(ptr);//누가 실행됐는지 순서대로 저장
                cnt++;//실행된 작업 수 1개 늘려줌
            }
            ptr++; // 다음 순위로 확인하러 가기위해 포인트 이동
            ptr %= taskNum; //원형큐처럼 동작하게 하기 위함
        }
        int res = answers.indexOf(location); // index가 순서, value가 a-0,b-1,… 이므로 index를 얻어줌
        res++; //문제에서 순서가 1부터이므로 1더해서 보정해줌
        return res;
    }
}
