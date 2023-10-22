class Solution {
    public int heightChecker(int[] heights) 
    {
        int temp[]=new int[heights.length];
        for(int i=0; i<temp.length; i++)
        {
            temp[i]=heights[i];
        }
        Arrays.sort(heights);
        int cnt=0;
        for(int i=0; i<heights.length; i++)
        {
            if(heights[i] != temp[i])
            {
                cnt++;
            }
        }
        return cnt;
    }
}