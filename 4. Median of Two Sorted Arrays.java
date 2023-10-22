class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Size of the two given Arrays
        int n1 = nums1.length;
        int n2 = nums2.length;

        ArrayList<Integer> arr3 = new ArrayList<>();
        // Apply the merge steps
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr3.add(nums1[i++]);
            } else {
                arr3.add(nums2[j++]);
            }
        }
        // Copy the left out elements
        while (i < n1) {
            arr3.add(nums1[i++]);
        }
        while (j < n2) {
            arr3.add(nums2[j++]);
        }
        // Find the median
        int n = n1 + n2;
        if (n % 2 == 1) {
            return (double) arr3.get(n / 2);
        }

        double median = (double) (arr3.get(n / 2 - 1) + arr3.get(n / 2)) / 2.0;
        return median;
    }
}
