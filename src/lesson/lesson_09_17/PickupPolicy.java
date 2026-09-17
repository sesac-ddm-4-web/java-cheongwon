package lesson.lesson_09_17;

public class PickupPolicy implements ShippingPolicy{
    @Override
    public int fee(int subtotal) {
        return 0;
    }
}
