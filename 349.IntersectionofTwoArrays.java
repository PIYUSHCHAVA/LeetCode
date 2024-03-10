import java.util.*;


public class IntersectionofTwoArrays 
{
    public  static int[] intersection(int[] nums1, int[] nums2)
    {
      Map<Integer,Integer> hm=new HashMap<>();
      for(int num : nums1)
      {
        hm.put(num, hm.getOrDefault(num,0)+1);
      }

      List<Integer> al=new ArrayList<>();
      for(int num : nums2)
      {
          if(hm.containsKey(num))
          {
            al.add(num);
            hm.remove(num);
          }
      }
      int [] result=new int [al.size()];
      for(int i=0; i<al.size(); i++)
      {
        result[i]=al.get(i); 
      }
      return result;

    }
    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int result[] = intersection(nums1, nums2);
    
        // Print the contents of the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
