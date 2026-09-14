package lesson.lesson_09_14;

public class BookDemo {
    public static void main(String[] args) {
        Book first = new Book("자바", 20000);
        Book second = new Book("데이터베이스", 18000);
        System.out.println(first.title + ": " + first.price);
        System.out.println(second.title + ": " + second.price);
    }
}
