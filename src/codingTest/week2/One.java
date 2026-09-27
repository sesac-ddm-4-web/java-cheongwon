package codingTest.week2;

import java.util.*;

//1. 의상
public class One {
    public int solution(String[][] clothes) {
        // i는 종류, j는 이름
        Map<String,Integer> map = new HashMap<>();
        //각 의상 종류별로, 몇벌 있는지 map에 카운팅
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        int answer = 1;
        //경우의수 문제, 종류수+1 한 이유 : 안입는 경우도 있기 때문
        for(String key : map.keySet()){
            answer *= (map.get(key)+1);
        }
        // 마지막 1가지 빼준이유, 옷을 모두 안입는 경우는 없기 때문
        answer--;
        return answer;
    }
}
