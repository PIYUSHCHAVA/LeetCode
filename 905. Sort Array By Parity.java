class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
       int evenIndex=0;
       for(int i=0; i<nums.length; i++)
       {
           if(nums[i] % 2 == 0)
           {
               swap(nums, i , evenIndex++);
           }
       }
       return nums;
    }
    public void swap(int nums[], int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}