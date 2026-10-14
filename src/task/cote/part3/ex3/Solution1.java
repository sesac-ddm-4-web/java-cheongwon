package task.cote.part3.ex3;

import java.util.*;

/**
 * 시간초과
 */

class Solution1 {
    public int[] solution(String[] gems) {
        int cnt = count(gems);
        int windowSize = cnt;
        int left = 0;
        int right = 0;
        boolean comp = false;

        while(windowSize <= gems.length){
            Deque<String> dq = new ArrayDeque<>();
            for(int i=0; i<windowSize; i++){
                dq.offerLast(gems[i]);
            }
            left = 1;
            right = windowSize;
            if(dqCount(dq) == cnt) break;
            for(int r=windowSize; r<gems.length; r++){
                left++;
                right++;
                dq.offerLast(gems[r]);
                dq.pollFirst();
                if(dqCount(dq) == cnt){
                    comp=true;
                    break;
                }
            }
            if(comp) break;
            windowSize++;
        }
        int[] answer = new int[2];
        answer[0] = left;
        answer[1] = right;
        return answer;
    }

    int count(String[] arr){
        Set<String> set = new HashSet<>();
        for(String s : arr){
            set.add(s);
        }
        return set.size();
    }
    int dqCount(Deque<String> dq){
        Set<String> set = new HashSet<>(dq);
        return set.size();
    }
}