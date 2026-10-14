package task.cote.part3.ex3;

import java.util.*;

/**
 * 처음에는 Set과 Deque를 사용해서 추가하고, Deque에 있는 원소의 개수를 찾는 식으로 했으나
 * 시간초과가 발생해서, 강의노트에 있는 힌트를 보고 HashMap을 사용해야 한다는것을 깨닫고
 * 수정해서 풀이했습니다
 *
 * 우선, 조건에 맞게 슬라이딩 윈도우를 오른쪽으로 늘리고 조건이 맞게되면
 * 왼쪽을 줄이고, 슬라이딩 윈도우의 최소 길이를 따로 필드에 저장해서, 그것보다 작으면
 * 최적의 슬라이딩 윈도우를 저장하도록 구현했습니다.
 */
class Solution2 {
    public int[] solution(String[] gems) {
        int cnt = count(gems);
        Map<String, Integer> map = new HashMap<>();
        int left = 0;
        int bestLeft = 0;
        int bestRight = gems.length - 1;
        int minSize = 97654321;

        for (int right = 0; right < gems.length; right++) {
            map.put(gems[right], map.getOrDefault(gems[right], 0) + 1);
            while (map.size() == cnt) {
                int windowSize = right - left + 1;
                if (windowSize < minSize) {
                    minSize = windowSize;
                    bestLeft = left;
                    bestRight = right;
                }
                String gem = gems[left];
                if (map.get(gem) == 1) {
                    map.remove(gem);
                } else {
                    map.put(gem, map.get(gem) - 1);
                }
                left++;
            }
        }
        return new int[]{bestLeft + 1, bestRight + 1};
    }

    int count(String[] arr) {
        Set<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        return set.size();
    }
}