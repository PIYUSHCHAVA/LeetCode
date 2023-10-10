class Solution {
    public String kthSmallestPath(int[] destination, int k) 
    {
       int m=destination[0]+1;
       int n= destination[1]+1;
       int [][] dp=new int [m][n];
       
       for(int i=0;i<m;i++)
        dp[i][n-1]=1;
       for(int j=0;j<n;j++)
        dp[m-1][j]=1;

        for(int i= m-2; i>=0; i--)
        {
            for(int j= n-2; j>=0;j--)
            {
                dp[i][j]=dp[i+1][j] + dp[i][j+1];
            }
        }
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i < m-1 && j < n-1)
        {
            if(k <=dp[i][j+1])
            {
                j++;
                sb.append('H');
            }
            else
            {
                k=k - dp[i][j+1];
                i++;
                sb.append('V');
            }
        }
        for(; i< m-1;i++) sb.append('V');
        for(; j< n-1;j++) sb.append('H');

        return sb.toString();
        
    }
}