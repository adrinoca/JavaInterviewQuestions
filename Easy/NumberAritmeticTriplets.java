package Easy;

// You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k)
// is an arithmetic triplet if the following conditions are met:
// 1. i < j < k,
// 2. nums[j] - nums[i] == diff, and
// 3. nums[k] - nums[j] == diff.
// Return the number of unique arithmetic triplets.

public class NumberAritmeticTriplets {

    public int aritmeticTriplets(int [] nums, int diff) {

        int numberTriplets = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        numberTriplets++;
                    }
                }
            }
        } return numberTriplets;
    }

    public static void main(String[] args) {
        Easy.NumberAritmeticTriplets aritmeticTriplets = new Easy.NumberAritmeticTriplets();

        // Test case 1
        int [] nums1 = {0,1,4,6,7,10};
        int diff1 = 3;
        int result1 = aritmeticTriplets.aritmeticTriplets(nums1, diff1);
        System.out.println("Test 1 - Expected: 2, Actual: " + result1);

        // Test case 2
        int [] nums2 = {4,5,6,7,8,9};
        int diff2 = 2;
        int result2 = aritmeticTriplets.aritmeticTriplets(nums2, diff2);
        System.out.println("Test 1 - Expected: 2, Actual: " + result2);

    }

}
