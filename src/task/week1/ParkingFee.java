package task.week1;

import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        int price = 0;

        if(minutes <= 30) price = 0;
        else{
            minutes -= 31; // 31~40 -> 0~9, 41~50 -> 10~19, ...
            minutes /= 10; // 0~9 -> 0, 10~19 -> 1, ...
            minutes++; // 0 -> 1, 1->2, ...
            price = minutes * 500; // 1*500, 2*500, ...
        }
        if(price > 10000) price = 10000;//최대 10000원
        System.out.println("주차 요금: " + price + "원");
    }
}
