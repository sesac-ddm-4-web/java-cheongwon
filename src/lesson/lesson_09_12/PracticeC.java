package lesson.lesson_09_12;

import java.util.Scanner;

public class PracticeC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //1번
//        int value = scanner.nextInt();
//        int minutes = value / 60;
//        int seconds = value % 60;
//        System.out.println(minutes+"분 " + seconds + "초");

        //2번
//        double v1 = scanner.nextDouble();
//        double v2 = scanner.nextDouble();
//        double avg = (v1 + v2) / 2;
//
//        if((avg >= 60) && (v1 >= 40) && (v2 >= 40)){
//            System.out.println("평균: " + avg);
//            System.out.println("PASS");
//        }else{
//            System.out.println("평균: " + avg);
//            System.out.println("FAIL");
//        }

        //3번
//        int input = scanner.nextInt();
//        int sum = 0;
//
//        for(int i=1; i<=input; i++){
//            if((i%3)==0) sum+=i;
//        }
//        System.out.println("합계: " + sum);


        //4번
        int cnt = 0;
        int price = 0;
        while(true){
            int req = scanner.nextInt();
            switch (req){
                case 1 -> {
                    cnt++;
                    price += 3000;
                }
                case 2 ->{
                    cnt++;
                    price += 4000;
                }
                case 0 ->{
                    System.out.println("주문 수: " + cnt);
                    System.out.println("총 금액: " + price);
                }
                default -> {
                    System.out.println("없는 메뉴입니다");
                }
            }
            if(req == 0) break;
        }
    }
}
