class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char Temp;
        while(i<j)
        {
            Temp=s[i];
            s[i]=s[j];
            s[j]=Temp;
            i++;
            j--;
        }
        for(int m=0;m<j;m++)
        {
            System.out.println(s[i]);
        }
    }
}