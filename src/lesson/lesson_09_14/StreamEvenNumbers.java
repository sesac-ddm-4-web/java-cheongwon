package lesson.lesson_09_14;

import java.util.List;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        // 스트림 실습 1: 짝수만 골라 한 줄씩 출력하세요.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(a->(a%2)==0)
                .forEach(System.out::println);
    }
}