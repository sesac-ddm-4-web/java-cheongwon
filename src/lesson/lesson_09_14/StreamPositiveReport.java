package lesson.lesson_09_14;

import java.util.List;

public class StreamPositiveReport {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -1, 0, 2, 4, 5);

        long cnt = numbers.stream()
                .filter(a->a>0)
                .count();
        System.out.println("양수 개수: " + cnt);

        numbers.stream()
                .filter(a->a>0)
                .map(a->a*a)
                .forEach(System.out::println);

        int sum = numbers.stream()
                .filter(a->a>0)
                .mapToInt(a->a*a)
                .sum();

        System.out.println("제곱 합계: " + sum);

    }
}
