package task.cote.part5.ex3;

/**
 * 오랫동안 진전이 없어서 강의노트를 보니, T분동안 몇명을 처리하는지?라는 글자가 써있었습니다.
 * 근데 이게 문제랑 무슨 상관일지 3분정도 고민을 해보니,
 * 아 시간을 알때, 몇명이 통과되는지를 구해주는 함수를 만들면
 * 시간을 인덱스로하고, 통과되는 인원수를 값으로하는 배열처럼 사용할 수 있겠구나 생각을 했습니다.
 * 그래서 left는 최소인 1로하고, right는 10^18로 잡았습니다.(인원최대*심사시간최대)
 * 그리고 이전 ex2에서의 풀이를 이용해서 left bound를 구해내는 방식으로 답을 냈습니다.
 */
class Solution {
    public long solution(int n, int[] times) {
        //n:입국심사 기다리는 사람수, times: 심사관 심사시간
        long left = 1l;
        long right = 1000000000000000000l;
        while(left<=right){
            long mid = left + (right-left)/2;
            long people = passNum(mid,times);
            if(people>=n){
                right = mid-1;
            }
            if(people<n){
                left = mid+1;
            }
        }
        long answer = right+1;
        return answer;
    }
    //T분동안 몇명 처리?
    long passNum(long T,int[] times){
        long res = 0l;
        for(int time : times){
            res+=(T/time);
        }
        return res;
    }
}