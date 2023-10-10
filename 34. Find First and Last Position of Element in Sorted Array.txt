class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        int result[]=new int []{-1,-1};
        //Serach for first occurance
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == target)
            {
                result[0]=i;
                break;
            }
        }
        //serach for last occurance
        for(int i=nums.length-1; i>=0; i--)
        {
            if(nums[i] == target)
            {
                result[1]=i;
                break;
            }
        }
        return result;
    }
}