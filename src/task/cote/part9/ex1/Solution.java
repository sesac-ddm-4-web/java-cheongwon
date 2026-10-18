package task.cote.part9.ex1;

/**
 * 사실상 오른쪽과 아래로만 갈 수 있으므로, 현재까지의 경로의 수 = 왼쪽까지 오는 경로의 수 + 위쪽까지 오는 경로의 수이다.
 * 그리고 또한, 물 웅덩이에서 오는 경우는 없으므로 물 웅덩이는 pass하도록 해서 경로의 수를 처음 초기화한 0으로 만듬
 * 첫번째 시작 위치는 1,1을 1로 잡아서 경로에 더해지도록 하고, (0,i), (j,0)은 모두 0으로 그대로 냅둬서 그쪽에서 오는 경로는 계산x
 */

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        //n,m -> 세로,가로
        //puddles : 물이 잠긴 지역
        //왼쪽 or 오른쪽에서만 올 수 있음
        boolean[][] pass = new boolean[n+1][m+1];
        int[][] dp = new int[n+1][m+1];
        for(int[] puddle : puddles){
            int x = puddle[0];
            int y = puddle[1];
            pass[y][x] = true;
        }
        dp[1][1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if((i==1) && (j==1)) continue;
                if(pass[i][j]) continue;
                dp[i][j] = (dp[i-1][j] + dp[i][j-1])%1000000007;
            }
        }

        int answer = dp[n][m];
        return answer;
    }
}