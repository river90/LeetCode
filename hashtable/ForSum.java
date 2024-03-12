package hashtable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if (nums[i] > 0 && nums[i] > target) {
                return res;
            }
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j-1]==nums[j]){
                    continue;
                }
                int left = j+1;
                int right = nums.length-1;
                //if(nums[j]==nums[j+1]) continue;

                while(right > left){
                    System.out.println(nums[i] + nums[j]);
                    if(nums[i] + nums[j] + nums[left] + nums[right] > target){
                        right--;
                    }else if(nums[i] + nums[j] + nums[left] + nums[right] < target){
                        left++;
                    }else{
                        System.out.println(i + "_" + j +"_" + left+ "_" + right);
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(right > left && nums[right-1]==nums[right])right--;
                        while(right > left && nums[left+1] ==nums[left]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        System.out.println(fourSum(nums,-294967296));
    }
}
