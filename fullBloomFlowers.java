class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) 
    {
        int n=flowers.length;
        int [] start=new int[n];
        int [] end=new int[n];
        for(int i=0; i<n; i++)
        {
            start[i]=flowers[i][0];
            end[i]=flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        int [] res=new int [people.length];

        for(int i=0; i<people.length;i++)
        {
            int temp=people[i];
            int started=binarySearchUpperBound(start,temp);
            int ended=binarySearchLowerBound(end, temp);
            res[i]=started-ended;
        }
        return res;
    }
    public int binarySearchUpperBound(int [] arr, int target)
    {
        int left=0;
        int right=arr.length;
        while(left < right)
        {
            int mid= left+(right-left)/2;
            if(arr[mid] <= target)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
    public int binarySearchLowerBound(int []arr, int target)
    {
        int left=0;
        int right=arr.length;
        while(left < right)
        {
            int mid=left+(right - left)/2;
            if(arr[mid] < target)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
    
}