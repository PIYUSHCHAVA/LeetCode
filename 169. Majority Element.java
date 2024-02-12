import java.util.*;

public class  Majority Element
{
    public static int majorityElement(int []nums)
    {
        Arrays.sort(nums);

        return nums[nums.length / 2];
    }    
    public static void main(String[] args) 
    {
        int nums1[]={3,2,3};
        int result1=majorityElement(nums1);
        System.out.println( "The outPut is "+result1);
        
        int nums2[]={2,2,1,1,1,2,2};
        int result2=majorityElement(nums2);
        System.out.println( "The outPut is "+result2);
    }
}
