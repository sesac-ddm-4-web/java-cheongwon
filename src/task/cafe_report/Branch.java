package task.cafe_report;

import java.util.HashMap;
import java.util.Map;

public class Branch {
    private String name;
    private Map<String,Item> items = new HashMap<>();//메뉴이름, 매출액

    public Branch(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item){
        if(items.containsKey(item.getName())){//이미 존재
            Item prevItem = items.get(item.getName());
            prevItem.addQuantity(item.getQuantity());
            items.put(item.getName(),prevItem);
        }else{//처음 추가
            items.put(item.getName(),item);
        }
    }

    public int totalMoney(){
        int res = 0;
        for(String name : items.keySet()){
            res += items.get(name).calcTotal();
        }
        return res;
    }
}
