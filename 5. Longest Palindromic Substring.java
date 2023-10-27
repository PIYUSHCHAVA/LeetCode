class Solution {
    int maxLen=0;
    int lo=0;
    public String longestPalindrome(String s) 
    {
        char[] arr=s.toCharArray();
        if(s.length()<2)
        {
            return s;
        }
        for(int i=0; i<arr.length; i++)
        {
           expandPalidrome(arr, i, i);
           expandPalidrome(arr, i, i+1); 
        }
        return s.substring(lo, lo+maxLen);
    }
    public void expandPalidrome(char[] s, int j, int k)
    {
        while(j>=0 && k<s.length && s[j]==s[k])
        {
            j--;
            k++;
        }
        if(maxLen < k- j-1)
        {
            maxLen=k-j-1;
            lo=j+1;
        }
    }
}