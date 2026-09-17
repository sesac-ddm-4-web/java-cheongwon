package lesson.lesson_09_17;

public class AgeCheck {
    public static void checkAge(int age) {
        if (age < 0 || age > 120) {
            // TODO: IllegalArgumentException을 던지는 한 줄을 작성하세요.
            throw new IllegalArgumentException("나이는 0~120입니다");
        }
    }

    public static void main(String[] args) {
        int age = 0;
        try {
            checkAge(age);
            System.out.println("등록 가능");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
