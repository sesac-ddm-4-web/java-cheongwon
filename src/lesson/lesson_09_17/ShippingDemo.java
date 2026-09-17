package lesson.lesson_09_17;

import java.util.function.BiFunction;

public class ShippingDemo {
    public static int total(int subtotal, ShippingPolicy policy){
        return subtotal+ policy.fee(subtotal);
    }

    public static void main(String[] args) {

        int[] subtotals = {13000,29999,30000,30001};

        for(int subtotal : subtotals){
            System.out.println("pickup=" + total(subtotal,new PickupPolicy()));
            System.out.println("delivery=" + total(subtotal,new DeliveryPolicy()));
        }

    }
}
