package task.cote.part6.ex3;

import java.util.*;

/**
 * 질문 : 문제마다 m,n이 다르고, 격자 배열에서, 가로 세로 위치가 좀 다른데
 * 이걸 햇갈리지 않도록, 일관되게 정해놓고 풀 수 있는 방법이 궁금합니다.
 */


class Solution {
    static int m;
    static int n;
    static int[] dx = new int[]{0,1,0,-1};
    static int[] dy = new int[]{-1,0,1,0};
    static int[][] visited;
    static Deque<int[]> queue = new ArrayDeque<>();

    public int solution(int[][] maps) {
        //n:가로,m:세로, x축 y축 바뀜
        m=maps.length;
        n=maps[0].length;
        visited = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                visited[i][j] = 0;
            }
        }
        visited[0][0] = 1;
        queue.offer(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i=0; i<4; i++){
                int nextX = x+dx[i];
                int nextY = y+dy[i];
                if(nextX<0 || nextX>=n || nextY<0 || nextY>=m) continue;
                if(visited[nextY][nextX] != 0) continue;
                if(maps[nextY][nextX] == 0) continue;

                visited[nextY][nextX] = visited[y][x] + 1;
                queue.offer(new int[]{nextX,nextY});
            }
        }
        if(visited[m-1][n-1] == 0) return -1;

        return visited[m-1][n-1];
    }
}