package lesson.lesson_10_17;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //관람차 타고싶어하는 아이 n
        //곤돌라에는 어린이 한두명만 탑승, 무게는 x를 초과할 수 없다
        //필요한 최대 곤돌라 수
        //input : n : 자녀수,x : 최대 무게
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        int[] cw = new int[n];
        boolean[] v = new boolean[n];
        for(int i=0; i<n; i++){
            cw[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(cw);
        int answer=0;
        int left = 0;
        int right = n-1;
        while(left<=right){
            answer++;
            if(left == right) break;
            if(cw[left]+cw[right]<=x){
                left++;
            }
            right--;
        }
        System.out.println(answer);
    }
}
