package task.cote.part7.ex3;

import java.util.*;

/**
 * 그래프가 주어져 있는 문제가 아니고, 직접 그래프로 만들어서 가중치를 추가해야되는 문제였음
 * 문제 특성상 모든 정점들의 쌍에 대해 edge가 존재하므로, 인접행렬 그래프 + prim 알고리즘을 써야한다고 판단
 * 하지만 강의시간에 배열코드에 관해서는 자세하게 설명을 듣지 못해서, 거의 강의노트에 있는 코드를 활용함
 *
 * 질문 : 그냥 일단은 Kruskal에 익숙해진 후 -> Prim + 인접리스트 정도만 익혀도 되는지
 */

class Solution {
    static final int INF = 1000000000;
    record Edge(int to, int cost){};
    public int minCostConnectPoints(int[][] points) {
        //points : [xi,yi]를 나타냄
        //거리 : x거리 + y거리
        //모든점을 연결하는 최단거리 구하기
        int n = points.length; //n:점 개수
        //vertex는 0~n-1까지로 정하고, 0-1, 0-2, ... 0-n-1 점들의 모든 가중치 구하기
        int[][] weight = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int[] a = points[i];
                int[] b = points[j];
                int w = Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]);
                weight[i][j] = w;
            }
        }
        boolean[] selected = new boolean[n];
        int[] minCost = new int[n];
        Arrays.fill(minCost,INF);
        minCost[0]=0;
        int total = 0;
        for(int step =0; step<n; step++){
            int u = -1;
            for(int v=0; v<n; v++){
                if(!selected[v] && (u == -1 || minCost[v] < minCost[u])) u=v;
            }
            if(u==-1 || minCost[u] == INF) return -1;
            selected[u] = true;
            total+=minCost[u];
            for(int v=0; v<n; v++){
                if(!selected[v] && weight[u][v] < minCost[v]) minCost[v] = weight[u][v];
            }
        }
        return total;
    }
}