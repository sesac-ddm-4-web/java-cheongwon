package codingTest.week1;

import java.util.*;
//5. 기능 개발
public class Five {
    public int[] solution(int[] progresses, int[] speeds) {
        //progresses:진도, speeds:속도
        List<Integer> list = new ArrayList<>();
        int temp=0;

        for(int i=0; i<progresses.length; i++){
            temp = 100 - progresses[i];
            if((temp%speeds[i])!=0){
                temp /= speeds[i];
                temp++;
            }else{
                temp /= speeds[i];
            }
            list.add(temp);
        }

        int cnt=0;
        int prev=list.get(0);
        List<Integer> ans = new ArrayList<>();

        for(int day : list){
            if(day <= prev){
                cnt++;
            }else{
                ans.add(cnt);
                cnt=1;
                prev=day;
            }
        }
        ans.add(cnt);

        int[] answer = ans.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
