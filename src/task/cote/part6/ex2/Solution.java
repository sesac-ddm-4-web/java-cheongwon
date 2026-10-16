package task.cote.part6.ex2;

import java.util.*;

/**
 * dfs나 bfs로 순회를 한번 싹 돌면, 연결되어있는 부분들은 모두 visited가 true가 되고
 * 모든 좌표쌍에 대해 dfs를 시도할 때 방문되지 않은 곳이 있었다면 1개씩 올리면, 떨어져있는 그래프 순회를 하게 되는것이므로
 * 몇개의 덩어리가 떨어져 있는지 구할 수 있었습니다.
 */

class Solution {
    static int m;
    static int n;
    static boolean[][] visited;
    static int[] dx = new int[]{0,1,0,-1};
    static int[] dy = new int[]{-1,0,1,0};
    static Deque<int[]> stack = new ArrayDeque<>();
    static int answer;

    public int numIslands(char[][] grid) {
        //1:땅,0:물 일때, 땅의 갯수 반환
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                visited[i][j]=false;
            }
        }
        answer = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visited[i][j] || (grid[i][j]=='0')) continue;
                dfs(new int[]{i,j},grid);
            }
        }
        return answer;
    }

    public void dfs(int[] pair,char[][] grid){
        int x = pair[0];
        int y = pair[1];
        if(visited[x][y]) return;
        visited[x][y] = true;
        stack.push(new int[]{x,y});
        while(!stack.isEmpty()){
            int[] temp = stack.pop();
            x = temp[0];
            y = temp[1];
            for(int i=0; i<4; i++){
                int nextX = x+dx[i];
                int nextY = y+dy[i];
                if(nextX<0 || nextX>=m || nextY<0 || nextY>=n) continue;
                if(visited[nextX][nextY]) continue;
                if(grid[nextX][nextY] == '0') continue;
                visited[nextX][nextY] = true;
                stack.push(new int[]{nextX,nextY});
            }
        }
        answer++;
    }
}