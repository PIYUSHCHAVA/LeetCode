public class PalidromicSubstring 
{
    int count=0;
    public  int SubstringCount(String s)
    {
        for(int start=0; start < s.length(); start++ )
        {
            palindrimCount(s, start, start);
            palindrimCount(s, start, start + 1);
        }
        return count;
    }
    public void palindrimCount(String s, int start, int end)
    {
        while(start >= 0 && end < s.length() && s.charAt(start)== s.charAt(end))
        {
            count++;
            start--;
            end++;
        }
    }
    public static void main(String[] args) 
    {
      PalidromicSubstring ps=new PalidromicSubstring();

      String s1="abc";
      System.out.println("Number of Palindrome Substring is :" + ps. SubstringCount(s1));  
      
      String s2="aaa";
      System.out.println("Number of Palindrome Substring is :" + ps. SubstringCount(s2));   


    }
}
