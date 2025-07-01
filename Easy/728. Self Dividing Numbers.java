class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        while(left<=right){
            String str=String.valueOf(left);
            boolean flag=true;
            for(char ch: str.toCharArray()){
                if(ch-'0'==0) {flag=false; break;}
                if(left%(ch-'0')!=0) {flag=false; break;}
            }
            if(flag)list.add(left);
            left++;
        }
        return list;
    }
}