class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) 
        {
            return true;
        }
        if (t.isEmpty()) 
        {
            return false;
        }
        // Compare the first characters of s and t.
        if (s.charAt(0) == t.charAt(0))
        {
            return isSubsequence(s.substring(1), t.substring(1));
        } 
        else
         {
            return isSubsequence(s, t.substring(1));
         }
    }
}
