package task.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ScoreSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        int sum = 0;
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            temp = sc.nextInt();//점수 받고
            list.add(temp);//arrlist에 추가
            sum+=temp;//전체 점수 합
            if(temp>=60) cnt++;//합격 인원 수
        }
        Collections.sort(list);
        System.out.println("평균: " + ((double)sum / num));
        System.out.println("최고점: " + list.getLast());
        System.out.println("합격 인원: " + cnt);

    }
}
