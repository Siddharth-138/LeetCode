// 213. House Robber II

class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        return Math.max(robCircle(nums,0,nums.length-2),robCircle(nums,1,nums.length-1));
    }
    static int robCircle(int[] nums,int start,int end){
        int prev1=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int temp=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}