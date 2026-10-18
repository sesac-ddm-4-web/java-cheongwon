package task.cote.part8.ex1;
import java.util.*;

/**
 * 가중치가 없는 최단거리 문제 -> bfs로 vertex1에서부터의 각 정점으로의 최단거리 구하기
 * 제일 멀리있는 정점 개수 구하기 -> distance를 sort한 후 이분탐색으로 lower bound를 구해서 배열 size와의 차로 개수 구하기
 */

class Solution {
    List<List<Integer>> graph;
    Deque<Integer> queue = new ArrayDeque<>();
    int[] distance;

    public int solution(int n, int[][] edge) {
        //n:노드수, edge:edge
        graph = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e : edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        distance = new int[n+1];
        queue.offer(1);
        distance[1] = 1;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : graph.get(cur)){
                if(distance[next] != 0) continue;
                distance[next] = distance[cur] + 1;
                queue.offer(next);
            }
        }
        Arrays.sort(distance);
        int left = 0;
        int right = distance.length;
        int target = distance[right-1];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(distance[mid] >= target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        int answer = distance.length - right - 1;
        return answer;
    }
}