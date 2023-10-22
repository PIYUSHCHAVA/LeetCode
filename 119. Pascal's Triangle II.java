class Solution {
    public List<Integer> getRow(int rowIndex) 
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        long prev=1;
        for(int i=1; i<=rowIndex; i++)
        {
            long next_value=prev * (rowIndex - i + 1)/i;
            al.add((int) next_value);
            prev=next_value;
        }
        return al;
        
    }
}