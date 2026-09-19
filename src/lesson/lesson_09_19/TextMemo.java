package lesson.lesson_09_19;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextMemo {
    public static void main(String[] args) {
        Path path = Path.of("out", "lesson07", "memo.txt");
        String text = "오늘은 파일 입출력을 배웁니다.\n직접 저장한 파일을 읽어봅니다.\n";
        try {
            Files.createDirectories(path.getParent());
            Files.writeString(path, text, StandardCharsets.UTF_8);//이전 내용은 지워짐
            String saved = Files.readString(path, StandardCharsets.UTF_8);
            System.out.print(saved);
        } catch (IOException e) {
            System.out.println("파일을 읽거나 저장하지 못했습니다: " + e.getMessage());
        }
    }
}
