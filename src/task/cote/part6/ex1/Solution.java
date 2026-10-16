package task.cote.part6.ex1;

import java.util.*;

/**
 * vertex의 최대값과, edge의 최대값이 같으므로,
 * 인접 리스트로 풀어야겠다고 생각했습니다.
 * 주어진 edges가 연결된 정점의 관계만 나타내므로,
 * graph에 양쪽으로 추가해주었습니다.
 */
class Solution {
    static boolean[] visited;
    static List<List<Integer>> graph;
    Deque<Integer> stack = new ArrayDeque<>();

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //n:정점 개수, edges:간선, source:출발점, destination:목적지
        graph = new ArrayList<>();
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            visited[i] = false;
            graph.add(new ArrayList<>());
        }
        //------------------초기화------------------
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            List<Integer> temp1 = graph.get(a);
            temp1.add(b);
            List<Integer> temp2 = graph.get(b);
            temp2.add(a);
        }
        stack.push(source);
        visited[source] = true;
        while(!stack.isEmpty()){
            int temp = stack.pop();
            if(temp == destination) return true;
            List<Integer> link = graph.get(temp);
            for(int next : link){
                if(!visited[next]){
                    visited[next] = true;
                    stack.push(next);
                }
            }
        }
        return false;
    }
}