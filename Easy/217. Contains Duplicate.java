// 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int s:nums){
            set.add(s);
        }
        return set.size()!=nums.length;
    }
}