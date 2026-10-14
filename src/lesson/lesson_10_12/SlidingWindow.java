package lesson.lesson_10_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SlidingWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.valueOf(st.nextToken());
        int[] arr = new int[]{2,1,5,1,3,2};

        int sum = 0;
        for (int i = 0; i <k; i++) {
            sum+=arr[i];
        }
        int answer = sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i];
            sum-=arr[i-k];
            answer = Math.max(answer,sum);
        }
        System.out.println(answer);
    }
}
