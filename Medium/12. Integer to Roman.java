class Solution {
    public String intToRoman(int num) {
        int numbers[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] symbols={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int len=numbers.length-1;
        StringBuffer sb=new StringBuffer();
        while(num>0){
            int i=num/numbers[len];
            while(i>0){
                sb.append(symbols[len]);
                i--;
            }
            num=num%numbers[len];
            len--;
        }
        return sb.toString();
    }
}