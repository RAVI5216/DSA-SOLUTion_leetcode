class Solution {
    public String intToRoman(int num) {
       int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String result="";
       String[] symbol={"M", "CM", "D", "CD","C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};
       for(int i=0;i<=values.length-1;i++)
       {
        while(num>=values[i])
        {
            result+=symbol[i];
            num-=values[i];
        }
       }
       return result;
    }
}