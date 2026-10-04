package codingTest.week3;
import java.util.*;

// 1. 베스트 앨범
public class One {
    public int[] solution(String[] genres, int[] plays) {
        //1순위, 장르
        //2순위, play수
        //3순위, 고유번호
        // key가 장르 이름, value를 [plays,index] List
        Map<String,List<int[]>> map = new HashMap<>();

        for(int i=0; i<genres.length; i++){
            map.computeIfAbsent(genres[i], k -> new ArrayList<>())
                    .add(new int[]{plays[i],i});
        }

        int[] answer = map.entrySet().stream()  //0번 인덱스가 plays이므로, sum으로
                .sorted(Comparator.comparingInt(            //총 재생수를 구해준 후 내림차순 정렬
                        (Map.Entry<String, List<int[]>> entry) -> entry.getValue().stream()
                                .mapToInt(arr -> arr[0])
                                .sum()
                ).reversed())
                .flatMap(entry -> entry.getValue().stream()//장르 내에서 plays 내림차순, index 오름차순
                        .sorted((a, b) -> {
                            if (a[0] != b[0]) {
                                return Integer.compare(b[0], a[0]);
                            }
                            return Integer.compare(a[1], b[1]);
                        })
                        .limit(2)
                        .map(arr -> arr[1])
                )
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
