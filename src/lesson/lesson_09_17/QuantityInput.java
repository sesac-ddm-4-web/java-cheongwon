package lesson.lesson_09_17;

public class QuantityInput {
    public static int parseQuantity(String text) throws InvalidQuantityException {
        int quantity = Integer.parseInt(text);
        // TODO: quantity가 1부터 100까지의 범위를 벗어나면
        // InvalidQuantityException("수량은 1~100입니다")을 던지세요.
        if(quantity<1 || quantity>100) throw new InvalidQuantityException("수량은 1~100입니다");


        return quantity;
    }

    public static void main(String[] args) {
        String[] inputs = {"1", "101", "-1", "3"};
        int total = 0;
        for (String input : inputs) {
            try {
                int quantity = parseQuantity(input);
                total += quantity;
                System.out.println("OK " + quantity);
            } catch (NumberFormatException e) {
                System.out.println("NOT_NUMBER");
            } catch (InvalidQuantityException e) {
                System.out.println("OUT_OF_RANGE");
            }
        }
        System.out.println("total=" + total);
    }
}
