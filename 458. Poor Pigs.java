class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) 
    {
        int testPerPig = minutesToTest / minutesToDie;
        int numPigs =0 ;
        int states =1;
        while(states < buckets)
        {
            states =states * (testPerPig + 1);
            numPigs++;
        }
        return numPigs;
        
    }
}