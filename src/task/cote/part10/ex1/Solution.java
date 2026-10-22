package task.cote.part10.ex1;

/**
 * 학생을 한 배열에 표현할 수 있도록 한 후
 * 이전 학생의 상태를 저장하고, 현재 상태와 비교하는 방식으로 풀이
 *
 * 풀이가 다른건지, 이 문제가 왜 그리디인지 모르겠습니다
 */
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //n:학생수, lost:도난당한 학생번호, reserve:여분학생번호
        int[] students = new int[n+1];//학생 번호 1~n까지;
        for(int l : lost){
            students[l] --;//잃어버린 학생은 -1
        }
        for(int r: reserve){
            students[r] ++;//여분이 있는 학생은 1
        }
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(students[i]>=0) answer++;
        }
        int prev = 0;
        for(int i=1; i<=n; i++){
            if(prev==1 && students[i]==-1){//이전 학생이 여분 있는 학생이고, 지금 학생이 잃어버림
                prev=0;
                answer++;
                continue;
            }
            if(prev==-1 && students[i]==1){//이전 학생이 잃어버린 학생이고, 지금 학생이 여분있음
                prev=0;
                answer++;
                continue;
            }
            prev = students[i];
        }
        return answer;
    }
}