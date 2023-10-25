class Solution {
    public int kthGrammar(int n, int k) 
    {
        int count=0;
        while(n!=0)
        {
            n--;
            if((k+1)%2==1)
                count++;

                k=(k+1)/2;
        }
        if(count%2==0)
          return 0;
         
         return 1;
        
    }
}