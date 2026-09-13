package lesson.lesson_09_12;

public class MainArgs {
    public static void main(String[] args) {
        System.out.println("args.length = " + args.length);
        if (args.length != 2) {
            System.out.println("Program arguments에 정수 두 개를 입력하세요.");
            return;
        }

        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
        System.out.println("문자열 연결: " + (args[0] + args[1]));

        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        System.out.println("합계: " + (first + second));
    }
}