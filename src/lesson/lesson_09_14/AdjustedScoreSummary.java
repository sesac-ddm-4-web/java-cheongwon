package lesson.lesson_09_14;

import java.util.List;
import java.util.stream.Stream;

public class AdjustedScoreSummary {
    public static void main(String[] args) {
        List<Integer> scores = List.of(-10, 45, 60, 80, 98, 100, 120);

        long count = scores.stream()
                .filter(num -> (num>=0) && (num<=100))
                .count();

        int total = scores.stream()
                .filter(num -> (num>=0) && (num<=100))
                .map(num->Math.min(num+5,100))
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("유효한 점수: " + count);
        System.out.println("보정 합계: " + total);


    }
}
