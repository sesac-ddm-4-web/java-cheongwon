package task.cafe_report;

public class Item {
    private String name;
    private int quantity;
    private int totalPrice;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int quantity, int totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void addQuantity(int num){
        quantity+=num;
    }

    public void addTotalPrice(int num){
        totalPrice+=num;
    }
}
