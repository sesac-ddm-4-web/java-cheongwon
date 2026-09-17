package lesson.lesson_09_17;

public class DeliveryPolicy implements ShippingPolicy{
    @Override
    public int fee(int subtotal) {
        if(subtotal>=30000) return 0;
        else return 3000;
    }
}
