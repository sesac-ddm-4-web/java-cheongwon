package lesson.lesson_09_12;

public class PracticeA {
    public static void main(String[] args) {
        /**
         *
         * 3
         * 3.0
         * 3.5
         * false
         * 5
         * -2^31
         */
        System.out.println(7 / 2);
        System.out.println((double) (7 / 2));
        System.out.println((double) 7 / 2);
        int divisor = 0;
        System.out.println(divisor != 0 && 10 / divisor > 1);
        int count = 2;
        System.out.println(count++ + count);
        int max = Integer.MAX_VALUE;
        System.out.println(max + 1);
    }
}
