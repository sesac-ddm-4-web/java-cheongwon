package lesson.lesson_09_17;

public class StatusMessage {
    public static void main(String[] args) {
        OrderStatus[] status = {OrderStatus.READY,OrderStatus.SHIPPED,OrderStatus.DELIVERED};

        for(OrderStatus o : status){
            System.out.println(o);
        }
    }
}
