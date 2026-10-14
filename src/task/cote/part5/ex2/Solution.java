package task.cote.part5.ex2;

/**
 * target>=mid인 경우, 왼쪽을 버려서, 오른쪽보다 한칸 큰 인덱스를 구함
 * target<=mid인 경우, 오른쪽을 버려서, 왼쪽보다 한칸 작은 인덱스를 구함
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        //target보다 mid가 작거나 같을때 왼쪽 영역을 버림
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target){
                right = mid-1;
            }
            if(nums[mid]<=target){
                left = mid+1;
            }
        }
        int rightIdx = left;
        rightIdx--;

        left = 0;
        right = nums.length -1;
        //target보다 mid가 크거나 같을때 오른쪽 영역을 버림
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid]>=target){
                right = mid-1;
            }
            if(nums[mid]<target){
                left = mid+1;
            }
        }
        int leftIdx = right;
        leftIdx++;
        if(leftIdx <= rightIdx){//target이 있는경우
            return new int[] {leftIdx,rightIdx};
        }else{
            return new int[] {-1,-1};
        }
    }
}