package lesson.lesson_09_14;

import java.util.List;

public class LongWordCount {
    public static void main(String[] args) {
        List<String> words = List.of("java", "if", "stream", "for", "lambda");

        long cnt = words.stream()
                .filter(word -> word.length()>=5)
                .count();
        System.out.println("긴 단어: " + cnt);

    }
}
