package lesson.lesson_09_14;

public class OrderLineDemo {
    public static void main(String[] args) {
        OrderLine first = new OrderLine("커피", 4000, 2);
        OrderLine second = new OrderLine("커피", 4000, 1);
        System.out.println("name=" + first.getName());
        System.out.println("quantity=" + first.getQuantity());
        System.out.println("before=" + first.amount() + "," + second.amount());

        try {
            System.out.println("changed=" + first.changeQuantity(0));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("after=" + first.amount() + "," + second.amount());
    }
}
