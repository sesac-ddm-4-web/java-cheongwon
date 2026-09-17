package lesson.lesson_09_17;

public class OrderStatusDemo {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.READY;
        System.out.println(status);
        System.out.println(status == OrderStatus.READY);
    }
}
