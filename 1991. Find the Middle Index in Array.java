class Solution {
    public int findMiddleIndex(int[] nums) 
    {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++)
        {
            right=right + nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            right=right - nums[i];
            if(left==right)
            {
                return i;
            }
            left=left +nums[i];
        }
        return -1;
    }
}