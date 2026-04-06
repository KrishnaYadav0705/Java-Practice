package DSA;
public class smallestIndexWithEqualValue {
    public static int smallestEqual(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};
        System.out.println(smallestEqual(arr));
    }
}
