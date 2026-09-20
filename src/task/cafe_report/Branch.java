package task.cafe_report;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Branch {
    private String name;
    private Map<String,Item> items = new LinkedHashMap<>();
    private int invalidCount; //제외한 내역
    private int totalCount; // 전체 내역
    private int totalPrice;//지점별 총 매출
    private int totalAmount;//지점별 총 판매 수량

    public Branch(String name) {
        this.name = name;
    }

    public void addTotalCount(){
        totalCount++;
    }
    public void addInvalidCount(){
        invalidCount++;
    }

    public void addItem(String itemName, int price, int quantity){
        if(items.containsKey(itemName)){
            Item prevItem = items.get(itemName);
            prevItem.addQuantity(quantity);
            prevItem.addTotalPrice(price*quantity);
            items.put(itemName,prevItem);
        }else{
            items.put(itemName,new Item(itemName,quantity,quantity*price));
        }
        totalAmount+=quantity;
        totalPrice+=(quantity*price);
    }

    public String getName() {
        return name;
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public int getInvalidCount() {
        return invalidCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
}
