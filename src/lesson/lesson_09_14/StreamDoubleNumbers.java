package lesson.lesson_09_14;

import java.util.List;

public class StreamDoubleNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 7);

        numbers.stream()
                .map(a -> a*2)
                .forEach(System.out::println);
        System.out.println("원본: " + numbers);
    }
}
