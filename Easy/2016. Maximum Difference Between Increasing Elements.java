// 2016. Maximum Difference Between Increasing Elements

class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        for(int j=nums.length-1;j>=0;j--){
            for(int i=0;i<nums.length;i++){
        if(i!=j&&i<j){
            int dif=nums[j]-nums[i];
            if(dif>max&&dif!=0){
                max=dif;
            }
        }
    }
}
        return max;
    }
}