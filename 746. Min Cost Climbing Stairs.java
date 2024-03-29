class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] cost) 
    {
        int n=cost.length;
         dp=new int[n];
        return Math.min(mincost(cost,n-1), mincost(cost,n-2));
    }
    public int mincost(int []cost, int n)
    {
        if(n < 0)
        {
            return 0;
        }
        if(n==0 || n==1)
        {
            return cost[n];
        }
        if(dp[n] !=0)
            return dp[n];

        dp[n]=cost[n] + Math.min(mincost(cost,n-1), mincost(cost,n-2));
        return dp[n];    

    }
}