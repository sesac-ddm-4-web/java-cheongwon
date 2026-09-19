package task.cafe_report;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int calcTotal(){
        return price*quantity;
    }
}
