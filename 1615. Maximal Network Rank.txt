class Solution {
    public int maximalNetworkRank(int n, int[][] roads)
     {
         //Number of road connected to city
         int [] numRoadsConnectedTocity= new int [100 + 1];

         //road to exit between two two cities
         boolean[][] roadexit=new boolean[n][n];

         for(int [] cities : roads)
         {
             numRoadsConnectedTocity[cities[0]]++;
             numRoadsConnectedTocity[cities[1]]++;

            roadexit[cities[0]][cities[1]]=true;
            roadexit[cities[1]][cities[0]]=true;
         }

         int maxRank=0;
         for(int i=0; i<n-1; i++)   //i ---> city1
         {
             for(int j=i+1; j<n; j++)  // j ---> city2
             {
                 int rank= numRoadsConnectedTocity[i] +numRoadsConnectedTocity[j];

                 if(roadexit[i][j])
                     rank--;

                    maxRank=Math.max(maxRank, rank);
             }
         }
        return maxRank;
    }
}