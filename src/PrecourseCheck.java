/*
 * 선수학습 모듈 1~5 점검 (20분).
 * 실행하기 전에 블록마다 출력을 예상해 '내 예측' 주석에 적습니다.
 * 다 적은 뒤 Run으로 한 번에 실행해 비교합니다.
 * 결과는 블록 이름(--- 줄) 아래에 순서대로 나옵니다. 블록 이름 줄은 예측에 넣지 않습니다.
 * 예측과 다른 줄이 있으면 왜 다른지 확인해봅니다.
 */
public class PrecourseCheck {
    public static void main(String[] args) {
        /* [모듈 1] 변수와 타입
         * 내 예측 (4줄):
         * 5일 3쪽
         * 5.75
         * 27쪽
         * 합계 234
         *
         */
        System.out.println("--- [모듈 1] 변수와 타입 ---");
        int pages = 23;
        int perDay = 4;
        System.out.println((pages / perDay) + "일 " + (pages % perDay) + "쪽");
        System.out.println(pages / 4.0);
        System.out.println(pages + perDay + "쪽");
        System.out.println("합계 " + pages + perDay);

        /* [모듈 2] 연산자
         * 내 예측 (5줄):
         * 4
         * false -> true 틀렸음 : point 값이 바뀐게 아니라 출력만했던거라 5였음
         * 일반
         * 0 -> 5 틀렸음
         * 1 -> 6 틀렸음 : point 값이 바뀐게 아니라 출력만했던거라 5였음
         *
         */
        System.out.println("--- [모듈 2] 연산자 ---");
        int point = 3;
        point += 2;
        System.out.println((point / 4) * 4);
        System.out.println((point % 4 == 1) && (point > 3));
        System.out.println(point > 10 ? "VIP" : "일반");
        System.out.println(point++);
        System.out.println(point);

        /* [모듈 3] 조건문과 반복문
         * 내 예측 (3줄):
         * 12
         * -2
         * 주말
         *
         */
        System.out.println("--- [모듈 3] 조건문과 반복문 ---");
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        int remain = 10;
        while (remain > 0) {
            remain -= 3;
        }
        System.out.println(remain);

        int day = 6;
        switch (day) {
            case 6:
            case 7:
                System.out.println("주말");
                break;
            default:
                System.out.println("평일");
        }

        /* [모듈 4] 메서드
         * 내 예측 (4줄):
         * 13000
         * 15000
         * 8000
         * 7500
         *
         */
        System.out.println("--- [모듈 4] 메서드 ---");
        int price = 15000;
        int paid = applyCoupon(price);
        System.out.println(paid);
        System.out.println(price);
        System.out.println(applyCoupon(8000));
        System.out.println(applyCoupon(8000, 500));

        /* [모듈 5] 객체와 참조
         * 내 예측 (5줄):
         * 202
         * true
         * false
         * true
         * true
         *
         */
        System.out.println("--- [모듈 5] 객체와 참조 ---");
        Locker first = new Locker(101); //first의 code = 101
        Locker second = first;//second와 first 같은 인스턴스 참조
        second.code = 202;//first, second의 code = 202
        Locker third = new Locker(202);//third의 code 202
        Locker spare = null;//spare는 null
        System.out.println(first.code);//202
        System.out.println(first == second);//true
        System.out.println(first == third);//false
        System.out.println(first.code == third.code);//true
        System.out.println(spare == null);//true

        /* [모듈 5] 문자열 비교
         * 내 예측 (2줄):
         * true -> false 틀렸음 : 새로 +를 하면 리터럴과 다르게 참조
         * true
         *
         */
        System.out.println("--- [모듈 5] 문자열 비교 ---");
        int cohort = 4;
        String id = "sesac4";
        String typed = "sesac" + cohort;//sesac4
        System.out.println(id == typed);//true
        System.out.println(id.equals(typed));//true
    }

    // 만 원 이상이면 2,000원 할인
    static int applyCoupon(int price) {
        if (price < 10000) {
            return price;
        }
        price -= 2000;
        return price;
    }

    // 할인 금액을 직접 정해서 적용
    static int applyCoupon(int price, int discount) {
        return price - discount;
    }
}

class Locker {
    int code;

    Locker(int code) {
        this.code = code;
    }
}