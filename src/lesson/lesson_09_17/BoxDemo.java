package lesson.lesson_09_17;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Double> price = new Box<>(12.5);
        System.out.println(price.get() * 2);

        Box<String> str = new Box<>("hihihi");
        System.out.println(str.get());

        Box<Integer> intBox = new Box<>(123);
        System.out.println(intBox.get());
//        Box<String> wrong = new Box<>(3);

    }
}
