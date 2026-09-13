package lesson.lesson_09_12;

public class PracticeB {
    // 요구사항: 1부터 3까지 더해서 6 출력. 반복 조건에 의도적인 오류가 있습니다.

    public static void main(String[] args) {
        int limit = 5;
        int total = 0;
        for (int i = 1; i < limit; i++) {
            total += i; // 이 줄에 중단점
        }
        System.out.println(total);
    }
}
