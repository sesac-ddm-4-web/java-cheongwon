package lesson.lesson_09_12;

public class Run {
    public static void main(String[] args){
        String a = "홍길동";
        String b = "홍길동";
        String c = new String("홍길동");
        String d = new String("홍길동");

        System.out.println(c==d);
    }
}
