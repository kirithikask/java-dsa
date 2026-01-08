//maximum subarray.kadane algorithm:used to find maximum subarray pick numbers and add if negative comes drop and restart from next
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int x : nums) {
            currentSum += x;
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) currentSum = 0;
        }

        return maxSum;
    }
}

