public class RearrangeArrayElementsbySign {
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                arr[pos] = nums[i];
                pos += 2;
            } else {
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
