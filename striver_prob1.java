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
//move zeros
class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}
