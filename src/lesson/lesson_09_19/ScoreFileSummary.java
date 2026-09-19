package lesson.lesson_09_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScoreFileSummary {
    public static void main(String[] args) {
        Path input = Path.of("data", "lesson07", "scores.txt");
        Path output = Path.of("out", "lesson07", "score-summary.txt");
        int count = 0;
        int total = 0;
        int passed = 0;
        try {
            try (BufferedReader reader = Files.newBufferedReader(input, StandardCharsets.UTF_8)) {
                String line;
                int lineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    try {
                        int score = Integer.parseInt(line.trim());
                        if (score < 0 || score > 100) {
                            System.out.println("건너뜀: " + lineNumber);
                            continue;
                        }
                        count++;
                        total += score;
                        if (score >= 60) {
                            passed++;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("건너뜀: " + lineNumber);
                    }
                }
            }
            String summary = "정상 점수: " + count + "개\n"
                    + "합계: " + total + "\n"
                    + "합격: " + passed + "명\n";
            Files.createDirectories(output.getParent());
            // TODO: summary를 output 경로에 UTF-8로 저장하는 한 줄을 작성하세요.
            Files.writeString(output,summary,StandardCharsets.UTF_8);
            System.out.print(summary);
        } catch (IOException e) {
            System.out.println("파일 처리 실패: " + e.getMessage());
        }
    }
}