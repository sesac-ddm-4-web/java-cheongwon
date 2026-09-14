package lesson.lesson_09_14;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle first = new Rectangle(3, 4);
        Rectangle second = new Rectangle(5, 2);
        System.out.println("첫 번째: " + first.area() + ", " + first.perimeter());
        System.out.println("두 번째: " + second.area() + ", " + second.perimeter());
    }
}
