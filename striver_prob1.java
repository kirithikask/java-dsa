//largestElement
class Solution {
    public int largestElement(int[] nums) {
        int max = nums[0];  

        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
//secondlargest element in an array
class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : nums) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } 
            else if (x < largest && x > secondLargest) {
                secondLargest = x;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
