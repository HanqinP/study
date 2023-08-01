package algorithm;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }else{
                return new int[]{map.get(target - nums[i]),i};
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,2,3,5,5,6};
        int[] result = twoSum(nums,3);
        System.out.println(String.format("result 0 is :%d \nresult 1 is :%d ",result[0],result[1]));
    }

}
