package lesson.lesson_10_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int left = Integer.valueOf(stringTokenizer.nextToken());
        int right = Integer.valueOf(stringTokenizer.nextToken());
        int[] arr = new int[] {3,1,4,1,5};
        long[] prefix = new long[arr.length + 1];
        for (int i=0; i<arr.length; i++){
            prefix[i+1] = prefix[i] + arr[i];
        }
        long sum = prefix[right+1] - prefix[left];
        System.out.println(sum);
    }
}
