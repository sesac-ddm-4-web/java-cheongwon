package codingTest.week1;

import java.util.*;

//4. 전화번호 목록
public class Four {
    public boolean solution(String[] phone_book) {
        //phone_book : 전화번호부 배열
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer=false;
                break;
            }
        }
        return answer;
    }
}
