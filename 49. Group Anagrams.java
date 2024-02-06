class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,Integer> hs=new HashMap<>();
        
        for(int i=0; i<strs.length;i++)
        {
            char [] newly=strs[i].toCharArray();
            Arrays.sort(newly);
            String sortedString=new String(newly);

            if(hs.containsKey(sortedString))
            {
                int index=hs.get(sortedString);
                ans.get(index).add(strs[i]);
            }
            else
            {
                List<String> newGroup=new ArrayList<>();
                newGroup.add(strs[i]);
                ans.add(newGroup);

                //put the Sorted String

                hs.put(sortedString, ans.size()-1);
            }
        }
        return ans;
    }
}