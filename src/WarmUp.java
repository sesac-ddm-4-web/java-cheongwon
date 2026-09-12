import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WarmUp {
    public static void main(String[] args){

        //1번
        System.out.println("------------1번------------");
        int[] scores = {45, 80, 60, 95, 55, 70};
        int passScore=60;

        List<Integer> result = new ArrayList<>();

        int sum = 0;
        for (int score : scores){
            if(score >= passScore){
                result.add(score);
                sum+=score;
            }
        }

        System.out.println("합격 점수: " + result);
        System.out.println("합격 인원: "+result.size() + "명");
        System.out.println("합격 점수 합계: "+sum);

        //2번
        System.out.println("------------2번------------");

        int[] prices = {5000, 12000, 8000, 20000, 10000};
        int discountThreshold = 10000;
        int discountAmount = 1000;

        List<Integer> priceResult = new ArrayList<>();

        int priceSum = 0;
        int count=0;
        int temp = 0;

        for(int price : prices){
            if(price >= discountThreshold){
                temp = price - discountAmount;
                count++;
            }else{
                temp = price;
            }
            priceSum+=temp;
            priceResult.add(temp);
        }

        System.out.println("최종 가격: " + priceResult);
        System.out.println("할인 상품: " + count + "개");
        System.out.println("전체 합계: " + priceSum + "원");


        //3번
        System.out.println("------------3번------------");
        String[] names = {"민수", "지연", "민수", "서준", "지연", "하나"};
        Set<String> res = new HashSet<>();

        int prevCount=0;
        int dupCount=0;
        for(String name : names){
            res.add(name);
            if(prevCount == res.size()) dupCount++;
            prevCount = res.size();
        }

        System.out.println("전체 신청: " + names.length + "건");
        System.out.println("실제 참가자: " + res.size() + "명");
        System.out.println("중복 신청: " + dupCount + "건");



    }
}
