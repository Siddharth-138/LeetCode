// 2078. Two Furthest Houses With Different Colors

class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        if(n==0||n==1) return 0;
        int m=0;
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            int firstNum=colors[i];
            for(int j=i+1;j<n;j++){
            if(firstNum!=colors[j]) count=Math.abs(i-j);
            m=Math.max(m,count);
            }
        }
        return m;
    }
}