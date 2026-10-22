package task.cote.part11.str;

import java.util.*;

/**
 * 문자열 길이 1일때, ... s.length일때까지 모두 해보기, s의 길이가 1000이하이므로, n^2 시간복잡도 괜찮을거라 판단
 * 이전 문자열을 prev에 넣고, 현재 문자열과 비교해서, 몇번 나오는지 count를 해서 결과에 저장
 * 갈 길이마다 구한 후 최소를 구해서 return
 */

class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int len = 1; len <= s.length(); len++){
            String prev = s.substring(0, len);
            int cnt = 1;
            int res = 0;
            int start;
            for(start = len; start + len <= s.length(); start += len){
                String temp = s.substring(start, start + len);
                if(temp.equals(prev)){
                    cnt++;
                }else{
                    res += len;
                    if(cnt > 1){
                        res += String.valueOf(cnt).length();
                    }
                    cnt = 1;
                }
                prev = temp;
            }
            res += len;
            if(cnt > 1){
                res += String.valueOf(cnt).length();
            }
            res += s.length() - start;
            answer = Math.min(answer, res);
        }
        return answer;
    }
}