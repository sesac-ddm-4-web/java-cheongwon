package lesson.lesson_10_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //n:작업 개수 ->작업에는 소요시간,마감시한
        //보상 : 마감시간(d) - 완료시간(f)
        //a : 작업의 기간
        //작업 기간이 짧은것 먼저 쳐내면, 될듯?
        //최대보상?!
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st1.nextToken());
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int d = Integer.parseInt(st2.nextToken());
            list.add(new int[]{a,d});
        }
        list.sort(Comparator.comparingInt(k->k[0]));
        long time = 0;
        long answer = 0;
        for(int[] task:list){
            time+=task[0];
            answer+=(task[1]-time);
        }
        System.out.println(answer);
    }
}
