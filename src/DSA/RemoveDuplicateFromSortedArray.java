//time complexity : O(n)
//space complexity : O(1)

package DSA;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length, i = 0, j = 1;
        while(j < n){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
            j++;
        }


        return i+1;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,5};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
