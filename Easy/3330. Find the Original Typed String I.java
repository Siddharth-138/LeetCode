class Solution {
    public int possibleStringCount(String word) {
        int len=word.length();
        int count=len;
        for(int i=1;i<len;i++){
            if(word.charAt(i)!=word.charAt(i-1)) count--;
        }
        return count;
    }
}