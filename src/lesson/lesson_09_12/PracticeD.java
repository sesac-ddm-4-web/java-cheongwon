package lesson.lesson_09_12;

import java.util.*;

public class PracticeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A-1번
//        int[] intArr = new int[] {10,20,30,40,50};
//        for (int i = (intArr.length-1); i>=0; i--){
//            System.out.print(intArr[i] + " ");
//        }
//        System.out.println();

        //A-2번
//        int[] prices = new int[] {1000,2000,3000};
//        int[] copy = Arrays.copyOf(prices,prices.length);
        //copy = prices로 하면 같은 배열을 참조하므로, 원본도 같이 바뀜
//        copy[0] += 500;
//        System.out.println("원본: " + Arrays.toString(prices));
//        System.out.println("복사본: " + Arrays.toString(copy));

        //A-3번
//        int[] seats = new int[5];
//        int cnt = 0;
//
//        while (true){
//            int input = sc.nextInt();
//
//            if(input == 0){
//                break;
//            }
//
//            if((input >= 1) &&(input <= 5)){
//                if(seats[input-1] == 0){
//                    System.out.println("예약했습니다");
//                    seats[input-1]=1;
//                    cnt++;
//                }else{
//                    System.out.println("이미 예약된 좌석입니다");
//                }
//            }else{
//                System.out.println("없는 좌석입니다");
//            }
//        }
//        System.out.println("좌석: " + Arrays.toString(seats));
//        System.out.println("예약 수: " + cnt);

        //B-1
//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("우유");
//        arrayList.add("빵");
//        arrayList.add("달걀");
//
//        arrayList.remove(1);
//        arrayList.add("사과");
//
//        System.out.println(arrayList);
//        System.out.println("첫 번째: " + arrayList.get(0));
//        System.out.println("항목 수: " + arrayList.size());

        //B-2
//        List<Integer> list = new ArrayList<>();
//        list.add(40);
//        list.add(10);
//        list.add(30);
//        list.add(20);
//
//        Collections.sort(list);
//        System.out.println("30 포함: " + list.contains(30));
//        System.out.println("정렬 후: " + list);
//        System.out.println("최솟값: " + list.get(0));
//        System.out.println("최댓값: " + list.get(list.size()-1));

        //B-3
//        List<String> arrList = new ArrayList<>();
//        int input = 0;
//        String name = null;
//
//        while(true){
//            input = sc.nextInt();
//            switch (input){
//                case 1->{
//                    name = sc.next();
//                    arrList.add(name);
//                    System.out.println("추가: " + name);
//                }
//                case 2->{
//                    if(arrList.size() == 0) System.out.println("대기자가 없습니다");
//                    else{
//                        System.out.println("입장: " + arrList.get(0));
//                        arrList.remove(0);
//                    }
//                }
//                case 3->{
//                    System.out.println("대기: " + arrList);
//                }
//                case 0->{
//                    System.out.println("남은 인원: " + arrList.size());
//                }
//            }
//            if(input == 0) break;
//        }


        //C-1
//        String[] names = {"민수", "지연", "민수", "서준", "지연"};
//        Set<String> set = new HashSet<>();
//        for(String name : names){
//            set.add(name);
//        }
//        System.out.println("서로 다른 이름: " + set.size());
//        System.out.println("지연 포함: " + set.contains("지연"));

        //C-2
//        Map<String,Integer> map = new HashMap<>();
//
//        map.put("커피",3000);
//        map.put("라떼",4000);
//        map.put("차",2500);
//
//        map.put("커피",3500);
//        map.remove("차");
//        System.out.println("커피: " + map.get("커피"));
//        System.out.println("메뉴 수: " + map.size());
//        System.out.println("차 포함: " + map.containsKey("차"));

        //C-3
        String[] words = {"java", "git", "java", "array", "git", "java"};
        Map<String,Integer> hashMap = new HashMap<>();
        List<String> arrayList = new ArrayList<>();

        for (String word : words){
            hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }

        for(String word : hashMap.keySet()){
            arrayList.add(word);
        }
        Collections.sort(arrayList);
        for(String word : arrayList){
            System.out.println(word + "=" + hashMap.get(word));
        }
        System.out.println("종류: " + hashMap.size());
    }
}
