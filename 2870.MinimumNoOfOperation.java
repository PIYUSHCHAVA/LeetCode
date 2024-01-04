//2870. Minimum Number of Operations to Make Array Empty

import java.util.HashMap;
import java.util.Map;

class MinimumNoOfOperation 
{
    public static int minOperations(int[] nums) 
    {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i: nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i: mp.values())
        {
            if(i==1)
            {
                return -1;
            }
            count=count + (i+2)/3;
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int result1 = minOperations(nums1);
        System.out.println("Result 1: " + result1);

        int[] nums2 = {2,3,3,2,2,4,2,3,4};
        int result2 = minOperations(nums2);
        System.out.println("Result 2: " + result2);
    }
}