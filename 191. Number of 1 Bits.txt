public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n)
     {
         int count=0;
         while(n != 0)
         {
             int last_bit= n & 1;//Stores the value of the last bit of the number n i.s(1,0)
             count =count + last_bit;//adds 0 if last_bit is 0 and add 1 if last_bit is 1
             n= n>>>1;//droppinhg the last bit of the binaray number n
         }
         return count;
    }
}