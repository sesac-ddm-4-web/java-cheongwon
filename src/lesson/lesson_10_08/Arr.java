package lesson.lesson_10_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arr {
//    public static void main(String[] args) {
//        int[] a = {10,20,30};
//        a[1] = 25;
//        long sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//        }
//        int[] bigger = Arrays.copyOf(a,5);
//        System.out.println(Arrays.toString(a));
//        System.out.println(sum);
//        System.out.println(Arrays.toString(bigger));
//    }

//    public static void main(String[] args) {
//        Integer[] numbers = new Integer[3];
//        numbers[0] = 10;
//        Object[] mixed = {10,"A",true};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(mixed));
//        System.out.println(numbers[0] + 1);
//    }


    public static void main(String[] args) {
        int[] raw = {10,20,30};
        List<Integer> list = new ArrayList<>(
                Arrays.stream(raw).boxed().toList());

    }
}
