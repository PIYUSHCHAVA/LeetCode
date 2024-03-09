public class MinimumCommonValue 
{
    public static int getCommon(int arr1 [], int arr2[])
    {
       int i=0;
       int j=0;
       while(i<arr1.length && j<arr2.length)
       {
        if(arr1[i] == arr2[j])
        {
            return arr1[i];
        }
        else if(arr1[i] < arr2[j])
        {
            i++;
        }
        else 
        {
            j++;
        }
       }
       return -1;
    }
    public static void main(String[] args) 
    {
        int arr1[]={1,2,3};
        int arr2[]={2,4};
        System.out.println(getCommon(arr1, arr2));
    }
    
}
