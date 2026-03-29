//Time complexity : O(n)
//Space Complexity : O(1)
package DSA;
public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, count = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
