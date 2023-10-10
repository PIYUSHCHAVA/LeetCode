class Solution {
    public int findLongestChain(int[][] pairs) 
    {
        Arrays.sort(pairs,(X1,Y1)->X1[1]-Y1[1]);
        int length=1;
        int lastEnd=pairs[0][1];
        for(int i=1; i<pairs.length;i++)
        {
            if(pairs[i][0] > lastEnd)
            {
                length++;
                lastEnd=pairs[i][1];
            }
        }
        return length;
    }
}
// your code here
    //    Arrays.sort(arr,(X1,Y1)->X1.y-Y1.y);
    //    int length=1;
    //    int lastEnd=arr[0].y;
    //    for(int i=1;i<n;i++)
    //    {
    //        if(arr[i].x > lastEnd)
    //        {
    //            length++;
    //            lastEnd=arr[i].y;
    //        }
    //    }
    //    return length;