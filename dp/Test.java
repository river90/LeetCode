package dp;

import java.util.ArrayList;
import java.util.List;

public class Test {

    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> temp = new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        //   res.add(new ArrayList<Integer>());
        backTracing(nums,0);
        return res;

    }
    public void backTracing(int[] nums,int index){
        if(index>nums.length){
            return;
        }
        res.add(new ArrayList<Integer>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backTracing(nums,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        int[] nums = {1,2,3};
        System.out.println(t.subsets(nums));

    }
}
