package lesson.lesson_09_17;

public class GenericMethodPractice {
    public static <T> void printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
    }

    public static void main(String[] args) {
        printTwice("java");
        printTwice(7); // 메서드 선언을 제네릭으로 바꾼 뒤 주석을 풉니다.
    }
}