class Solution {
    public String frequencySort(String s)
    {
        //create a hashMap
        Map<Character,Integer> hs=new HashMap<>();
        //count the frequency of character
        for(char count: s.toCharArray())
        {
            hs.put(count, hs.getOrDefault(count, 0) + 1);
        }
        List<Character> al=new ArrayList<>(hs.keySet());
        al.sort((a,b) -> hs.get(b) - hs.get(a));

        //build the result string
        StringBuilder res=new StringBuilder();
        for(char count : al)
        {
            int frequency= hs.get(count);
            for(int i=0; i<frequency; i++)
            {
                res.append(count);
            }
        }
        return res.toString();
    }
}