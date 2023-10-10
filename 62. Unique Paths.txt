class Solution {
    public int uniquePaths(int m, int n) 
    {
        // if(m == 1 || n == 1)
        // {
        //     return 1;
        // }
        // int left=uniquePaths(m, n-1);
        // int right=uniquePaths(m-1, n);
        // return left + right;4
        
        long ans=1;
        for(int i=1;i<=m-1;i++)
        {
            ans=ans*(n-1+i)/i;
        }
        return (int)ans;
    }
}