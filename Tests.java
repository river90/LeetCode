//class Test {
//    public static int maxProfit(int k, int[] prices) {
//        int len = prices.length;
//        int[][][] dp = new int[len][k][2];
//        for (int i=0;i<k;i++){
//            dp[0][i][0] = -prices[0];
//        }
//
//        for(int i=1;i<len;i++){
//            dp[i][0][0] = Math.max(dp[i-1][0][0],0 - prices[i]);
//            dp[i][0][1] = 0;
//            for(int j=1;j<k;j++){
//                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j-1][1] - prices[i]);
//                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0] + prices[i]);
//            }
//            System.out.println(dp[i][0][0]);
//        }
//        return dp[len-1][k-1][1];
//    }
//
//    public static void main(String[] args) {
//        int[] prices = {3,2,6,5,0,3};
//        System.out.println(maxProfit(2,prices));
//    }
//
//
//
//}

class Test {
    public static int wiggleMaxLength(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        if(nums.length==2){
            if(nums[0]!=nums[1]){
                return 2;
            }else{
                return 1;
            }
        }
        int res = 0;
        int s = 0;
        int j= 1;
        int i =0;
        while(i<j && j<nums.length){
            if(s<=0 && nums[j] - nums[i]>0){
                res++;
                s = 1;
            }
            if(s>=0 && nums[j] - nums[i] < 0){
                res++;
                s=-1;
            }
            i = j;
            j++;
        }
        return res+1;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,5};
        System.out.println(wiggleMaxLength(nums));
    }

}
