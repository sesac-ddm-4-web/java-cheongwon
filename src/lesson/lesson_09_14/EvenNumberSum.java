package lesson.lesson_09_14;

import java.util.List;

public class EvenNumberSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 6, 1, 8, 5, 2);

        int total = numbers.stream()
                .filter(num -> (num%2) == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("짝수 합계: " + total);
    }
}
