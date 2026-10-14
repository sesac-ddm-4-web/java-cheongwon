package task.cote.part3.ex2;

/**
 * 질문 : nums.length가 <= 20000 로 명시되어 있었고,
 *      가장 단순하게 O(N^2)으로 풀었는데 풀렸습니다.
 *      근데 강의노트의 part0 시간복잡도 부분에서 N크기가 1000이하일때,
 *      O(N^2)가능성이 있다고 써있는데 코딩테스트 문제를 풀 때, 이런부분을
 *      어떻게 판단해야할지가 궁금합니다.
 *
 *
 * 풀이 : 처음에는 구간 합 문제여서 슬라이딩 윈도우로 생각했지만,
 *      하지만 윈도우 크기가 가변적이기 때문에 비효율적이라 판단해서,
 *      누적합문제로 다시 판단해 풀이
 */
class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int[] prefix = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];
        }
        for(int i=0; i<prefix.length; i++){
            for(int j=i+1; j<prefix.length; j++){
                if((prefix[j]-prefix[i]) == k) ans++;
            }
        }
        return ans;
    }
}