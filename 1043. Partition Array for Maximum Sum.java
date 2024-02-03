class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k)
    {
          int n=arr.length;
          int dp[] = new int[n + 1];
          for(int i=1; i<=n; i++)
          {
              int ans=0;
              int currMax=0;
              for(int j=1; j<=k && (i - j) >=0; j++)
              {
                  currMax= Math.max(currMax, arr[i-j]);
                  ans=Math.max(ans,dp[i-j] + currMax * j);
              }
              dp[i]=ans;
          }
          return dp[n];
    }
}