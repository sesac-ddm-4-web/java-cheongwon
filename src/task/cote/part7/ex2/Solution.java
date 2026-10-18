package task.cote.part7.ex2;

import java.util.*;

/**
 * prerequisites: [1] -> [0]을 수강해야함 => [1]->[0]으로의 방향그래프
 * 구현방법 : [0]에 해당하는애의 indegree를 1씩 증가시킴
 */

class Solution {
    int[] indegree;
    List<List<Integer>> graph;
    Deque<Integer> queue = new ArrayDeque<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //numCourses:수강해야하는 총 과목수, 0~n-1
        indegree = new int[numCourses];
        graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prerequisite : prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
            indegree[prerequisite[0]]++;
        }
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0) queue.offer(i);
        }

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : graph.get(cur)){
                indegree[next]--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        boolean flag = false;
        for(int i=0; i<numCourses; i++){
            if(indegree[i] !=0) flag =true;
        }
        return !flag;
    }
}