package lesson.lesson_09_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class LineNumbers {
    public static void main(String[] args) {
        Path path = Path.of("data", "lesson07", "notes.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            int number = 1;
            while ((line = reader.readLine()) != null) {//String에서 null과 ""는 다름
                System.out.println(number + ": " + line);
                number++;
            }
        }
        catch(IOException e){
                System.out.println("파일을 찾지 못했습니다: " +e.getMessage());
        }

    }
}
