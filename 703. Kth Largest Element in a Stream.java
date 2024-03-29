class KthLargest 
{
    int K;
    ArrayList<Integer> list=new ArrayList<>();

    public KthLargest(int k, int[] nums) 
    {
        K=k;
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        
    }
    
    public int add(int val) 
    {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() -K);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */