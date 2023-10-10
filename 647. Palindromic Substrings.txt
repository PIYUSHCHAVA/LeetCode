class Solution {
    int count=0;
    public int countSubstrings(String s) 
    {
        
        for(int start=0; start<s.length(); start++)
        {
            palindromeCount(s,start,start);
            palindromeCount(s,start,start+1);
        }
        return count;
    }
    public void palindromeCount(String str, int start, int end)
    {
        while(start >=0 && end < str.length() && str.charAt(start)==str.charAt(end))
        {

            count++;
            start--;
            end++;
        }
        
    }

}