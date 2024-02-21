public class BitwiseANDofNumbersRange 
{
    public static int operator(int left , int right)
    {
        int ans= right;
        while(right > left)
        {
            ans=right &(right - 1);
            right=ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int left=5, right=7;
        System.out.println(operator(left, right));
    }
}
