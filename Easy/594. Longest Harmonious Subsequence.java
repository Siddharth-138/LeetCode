class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        for(int n:map.keySet()){
            if(map.containsKey(n+1)){
                int cur=map.get(n)+map.get(n+1);
                max=Math.max(max,cur);
            }
        }
        return max;
    }
}