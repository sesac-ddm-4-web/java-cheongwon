package lesson.lesson_09_14;

public class ExpressRule extends ShippingRule {

    @Override
    public int fee(int subtotal) {
        return super.fee(subtotal)+2000;
    }
}
