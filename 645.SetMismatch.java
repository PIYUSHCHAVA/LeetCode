import java.util.Arrays;

public class SetMismatch
{
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int total = (n * (n + 1)) / 2;
        int sum = nums[0];
        int duplicate = -1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                duplicate = nums[i];

            sum += nums[i];
        }

        int missing = total - (sum - duplicate);

        return new int[]{duplicate, missing};
    }
    public static void main(String[] args) 
    {
        SetMismatch setm = new SetMismatch();

        // Example usage:
        int[] nums = {1, 2, 2, 4}; // Replace this array with your input
        int[] result = setm.findErrorNums(nums);

        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}
