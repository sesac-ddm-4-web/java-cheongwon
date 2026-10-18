package task.cote.part9.ex2;

import java.util.*;

/**
 * 대각선 왼쪽, 대각선 아래쪽으로만 갈 수 있음 -> 그렇다면, 다음 위치에서의 dp값을 구하려면, 대각선 오른쪽위 왼쪽위에서 올 수 있다는것
 * 거기서 최댓값과 현재 triangle의 값을 더해주면 현재 dp값이 됨
 * 그리고 또한, 최종 최댓값은 제일 아래줄에 존재하므로, 순회하며 최댓값을 구해줌
 */

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        //삼각형은 index 0~n-1까지임
        int[][] dp = new int[n][n];
        dp[0][0] = triangle[0][0];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if((i==0)&&(j==0)) continue;
                if(j==0){//첫번째 column은 위에서만 옴
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1])+triangle[i][j];
            }
        }

        int answer = 0;
        for(int i=0; i<n; i++){
            answer = Math.max(answer,dp[n-1][i]);
        }
        return answer;
    }
}