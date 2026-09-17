package lesson.lesson_09_17;

public class NumberParsePractice {
    public static void main(String[] args) {
        String text = "abc"; // "abc"로 바꿔 실행 흐름을 비교하세요.
        try {
            int number = Integer.parseInt(text);
            System.out.println(number + 1);
        } catch (NumberFormatException e) {
            System.out.println("정수를 입력하세요");
        }
        System.out.println("확인 완료");
    }
}
