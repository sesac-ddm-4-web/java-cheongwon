package codingTest.week1;

import java.util.*;

//2. 폰켓몬
public class Two {
    public int solution(int[] nums) {
        //nums : N마리 포켓몬의 종류 번호, length가 항상 짝수
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int setSize = set.size();
        int numsLength = nums.length;
        int answer = 0;

        answer = Math.min(setSize, (numsLength/2));

        return answer;
    }
}
