package task.cote.part7.ex1;
import java.util.*;

/**
 * 기본적으로 edges.length와 vertex의 수가 같으므로, 빠져야하는 edge는 단 1개인것을 알 수 있다.
 * 그러므로 vertex에 대해서 union을 계속하다가 false 즉 사이클이 만들어지는 순간 그 edge를 반환하면 된다는것을
 * 쉽게 알 수 있다.(사이클 edge중 마지막에 추가된 edge를 return하라고 문제에 명시되어있기 때문)
 */

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        //노드 : n개, 1~n까지
        //n개의 노드로 이어진 트리가 되도록, 제거할 수 있는 간선 반환, 여러개인경우, 가장 마지막 간선 반환
        int[] answer = new int[2];
        DSU dsu = new DSU(edges.length+1);

        for(int[] edge : edges){
            if(!dsu.union(edge[0],edge[1])){
                answer[0] = edge[0];
                answer[1] = edge[1];
            }
        }
        return answer;
    }

    static class DSU{
        int[] parent;
        int[] size;
        DSU(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0; i<n; i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        int find(int x){
            if(parent[x]==x) return x;
            return parent[x]=find(parent[x]);
        }
        boolean union(int a, int b){
            int ra = find(a);
            int rb = find(b);
            if(ra == rb) return false;
            if(size[ra] < size[rb]){
                int t = ra;
                ra = rb;
                rb = t;
            }
            parent[rb] = ra;
            size[ra] += size[rb];
            return true;
        }
    }
}