public class MissingNumber 
{
    public static int  missingNumber(int [] nums)
    {
       int n= nums.length;
       int expectedSum = n * (n + 1) / 2;
       int actualSum = 0;

       for(int num : nums)
       {
         actualSum = actualSum + num;
       }
       return expectedSum - actualSum;
    }
    public static void main(String[] args) 
    {
        int [] arr={3,0,1};
        int res = missingNumber(arr);
        System.out.println(res);
            }
}
