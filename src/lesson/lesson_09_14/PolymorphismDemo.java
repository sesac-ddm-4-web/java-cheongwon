package lesson.lesson_09_14;

/**
 * 예상 :
 * 3000
 * 0
 * 5000
 *
 * 30000일때:
 * 0
 * 0
 * 2000
 */

class ShippingRule {
    public int fee(int subtotal) {
        if (subtotal >= 30000) {
            return 0;
        }
        return 3000;
    }
}

class PickupRule extends ShippingRule {
    @Override
    public int fee(int subtotal) {
        return 0;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        ShippingRule[] rules = {new ShippingRule(), new PickupRule(), new ExpressRule()};
        for (ShippingRule rule : rules) {
            System.out.println(rule.fee(13000));
        }
    }
}