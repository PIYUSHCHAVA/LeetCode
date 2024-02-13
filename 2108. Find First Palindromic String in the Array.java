
public class PalindromicString  
{
    static String firstPalindrome(String [] word)
    {
        for(String str : word)
        {
            if(isPalindrome(str))
            {
                return str;
            }
        }
        return "";
    }
    static boolean isPalindrome(String str)
    {
       int left=0;
       int right=str.length()-1;
       while(left < right)
       {
        if(str.charAt(left) != str.charAt(right))
        {
             return false;
        }
        left++;
        right--;
       }
       return true;
    }
    public static void main(String[] args) 
    {
        String word1[]={"abc","car","ada","racecar","cool"};
        String res1=firstPalindrome(word1);
        System.out.println(res1);

        String word2[]={"notapalindrome","racecar"};
        String res2=firstPalindrome(word2);
        System.out.println(res2);
    }
}
