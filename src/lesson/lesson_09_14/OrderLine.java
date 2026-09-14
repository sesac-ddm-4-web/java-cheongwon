package lesson.lesson_09_14;

public class OrderLine {
    private String name;
    private int price;
    private int quantity;

    public OrderLine(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int amount(){
        return price*quantity;
    }

    public boolean changeQuantity(int next){
        if(next<1 || next>100) throw new IllegalArgumentException("1~100 사이 값이 입력되야 합니다. 입력 값 : " + next);
        quantity = next;
        return true;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }

}
