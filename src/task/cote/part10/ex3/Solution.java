package task.cote.part10.ex3;

import java.util.*;

/**
 * 영화관 문제랑 비슷했습니다
 * 질문 : Comparator.comparingInt()로 제출했을때는 시간초과가 났는데,
 * 직접 람다식을 넣어준 경우는 성공했습니다.. 이는 왜 그런것이고, 실제 코딩테스트를 볼때는 어떻게 해야할지 궁금합니다.
 */

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
//         Arrays.sort(routes, Comparator.comparingInt(a->a[1]));
        Arrays.sort(routes,(a,b)->Integer.compare(a[1],b[1]));
        int prev = routes[0][1];
        answer++;
        for(int i=1; i<routes.length; i++){
            if(prev < routes[i][0]){
                prev = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}