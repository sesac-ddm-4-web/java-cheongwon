package lesson.lesson_09_17;

public enum Fulfillment {
    PICKUP(new PickupPolicy()),
    DELIVERY(new DeliveryPolicy());

    private ShippingPolicy policy;

    Fulfillment(ShippingPolicy policy){
        this.policy = policy;
    }

    public ShippingPolicy createPolicy(){
        return policy;
    }
}
