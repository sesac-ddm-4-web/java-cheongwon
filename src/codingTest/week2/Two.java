package codingTest.week2;

import java.util.*;

//2. 올바른 괄호
public class Two {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean answer = true;
        char temp = ' ';
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            if(temp == '('){//왼쪽 괄호 등장시 스택에 1 넣기
                stack.push(1);
            }else{//왼쪽 괄호 등장시
                if(stack.isEmpty()){//비어있으면, 잘못된 괄호
                    answer = false;
                    break;
                }else{// 비어있지 않으면, 1을 하나 없애기
                    stack.pop();
                }
            }
        }
        if((answer == true) && !stack.isEmpty()){//마지막에 스택이 비어있어야, 올바른 괄호이기때문에 검사
            answer = false;
        }
        return answer;
    }
}
