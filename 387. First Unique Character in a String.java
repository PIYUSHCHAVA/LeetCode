class Solution 
{
    public int firstUniqChar(String s)
    {
        Map<Character,Integer> hs=new HashMap<>();
        //count character of frequencies
        for(char c : s.toCharArray())
        {
            hs.put(c, hs.getOrDefault(c, 0)+1);
        }
        //find the first unique charcater
        for(int i=0; i<s.length(); i++)
        {
            if(hs.get(s.charAt(i))==1)
            {
                return i;
            }
        }
        //if unique character is found
        return -1;
    }
}