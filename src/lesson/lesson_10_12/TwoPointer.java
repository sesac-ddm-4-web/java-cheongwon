package lesson.lesson_10_12;

public class TwoPointer {
    public static void main(String[] args) {
        long[] arr = new long[]{1,2,4,7,11};
        int left = 0;
        int right = arr.length-1;
        int target = 9;
        while (left < right){
            long sum = (long) arr[left] + arr[right];
            if(sum == target) break;

            if(sum<target) left++;
            else right--;
        }

        System.out.println("Left: " + arr[left] + ", Right: " + arr[right]);
    }
}
