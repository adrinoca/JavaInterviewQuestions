class MinimumSize {
    public int minSubArrayLen(int target, int[] nums){

        int slidingwindow = 1;
        
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + nums[i + slidingwindow] >= target) {
                return slidingwindow;
            } 
        }
    }
}