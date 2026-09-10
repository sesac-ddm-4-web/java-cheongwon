import java.util.Scanner;

public class MyPractice {

    public static void main(String[] args){

        //N이 주어졌을때, 1~N까지 진행
        //3,6,9 박수 횟수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s;
        int cnt = 0;
        for(int i=1; i<=N; i++){
            s = String.valueOf(i);
            for(int j=0; j<s.length(); j++){
                if((s.charAt(j) == '3') || (s.charAt(j) == '6') || (s.charAt(j) == '9')){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }
}
