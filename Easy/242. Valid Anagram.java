class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(String.valueOf(arr1).equals(String.valueOf(arr2))) return true;
        return false;
    }
}