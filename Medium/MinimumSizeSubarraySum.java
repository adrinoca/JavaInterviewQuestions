class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums){

        int slidingwindow = 1;
        int sum = 0;

        while (slidingwindow <= nums.length) {

            for (int i = 0; i <= nums.length - slidingwindow; i++) {

                for (int j = i; j <= i + slidingwindow - 1; j++) {
                    sum += nums[j];
                }

                if (sum >= target){
                    return slidingwindow;
                }
                sum = 0;
            }
            slidingwindow++;
     } return 0;
    }

    public int minSubArrayLenTwoPointers(int target, int[] nums) {

        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {

                int currentLength = right - left + 1;

                if (currentLength < minLength) {
                    minLength = currentLength;
                }

                currentSum -= nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    public static void main (String[] args) {
        MinimumSizeSubarraySum minimumSize = new MinimumSizeSubarraySum();
        System.out.println(minimumSize.minSubArrayLenTwoPointers(7, new int[]{2,3,1,2,4,3}));         // Output: 2 <- [4, 3]
        System.out.println(minimumSize.minSubArrayLenTwoPointers(11, new int[]{1,1,1,1,1,1,1,1,1}));  // Output: 0 
        System.out.println(minimumSize.minSubArrayLenTwoPointers(11, new int[]{1,2,3,4,5}));          // Output: 3 
    }

}