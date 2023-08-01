package algorithm;

public class LeetCode26_RemoveDuplicatesFromSortedArray {

    //双指针
    public static int removeDuplicates(int[] nums) {

        int left = 0;
        int right = 1;
        for(int i = 1;i<nums.length;i++){

            right = i;
            if(nums[right]!=nums[left]){
                left++;
                nums[left] = nums[right];
            }

        }

        return left+1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,2,3,5,5,6};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

}
