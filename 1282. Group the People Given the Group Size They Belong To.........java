class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes)
     {
         int n=groupSizes.length;
         ArrayList<ArrayList<Integer>>al=new ArrayList<>();
         for(int i=0;i<n+1;i++)
         {
             al.add(new ArrayList<>());
         }
         for(int i=0;i<n;i++)
         {
             al.get(groupSizes[i]).add(i);
         }
         List<List<Integer>>ans=new ArrayList<>();
         for(int i=1;i<=n;i++)
         {
             if(al.size()!=0)
             {
                 int c=0;
                 while(c<al.get(i).size())
                 {
                     List<Integer>temp=new ArrayList<>();
                     int k=0;
                     while(k<i)
                     {
                         temp.add(al.get(i).get(c));
                         k++;
                         c++;
                     }
                     ans.add(temp);
                 }
             }
         }
        return ans;
    }
}