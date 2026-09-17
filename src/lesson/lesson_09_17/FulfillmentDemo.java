package lesson.lesson_09_17;

public class FulfillmentDemo {
    public static void main(String[] args) {
        Fulfillment fulfillment = Fulfillment.DELIVERY;
        int subtotal = 13000;

        System.out.println("mode=" + fulfillment);
        System.out.println("total=" + ShippingDemo.total(subtotal, fulfillment.createPolicy()));
    }
}
