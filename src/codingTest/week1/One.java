package codingTest.week1;

import java.util.*;

//1. 완주하지 못한 선수
public class One {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        for(String name : participant){
            map.put(name,map.getOrDefault(name,0)+1);
        }
        for(String com : completion){
            map.put(com,map.get(com)-1);
        }
        String answer = "";

        for(String key : map.keySet()){
            if(map.get(key)==1){
                answer = key;
            }
        }
        return answer;
    }
}
