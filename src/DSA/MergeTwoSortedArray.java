//time complexity : O(n)
//space complexity : O(1)
package DSA;
import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (j >= 0 && i >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0}; int m = 3;
        int[] arr2 = {2, 7, 8}; int n = 3;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
}
