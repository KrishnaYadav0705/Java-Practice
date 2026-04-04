//time complexity = O(n)
//space complexity = O(n)
package DSA;
import java.util.Arrays;
public class SortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int c1 = 0,c2 = 0,c3 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) c1++;
            if(nums[i] == 1) c2++;
            if(nums[i] == 2) c3++;
        }
        for(int i = 0; i<n; i++){
            if(c1-- > 0){
                nums[i] = 0;
            }else if(c2-- > 0){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
    public static void main(String[] args) {
         int[] arr = {1,0,0,2,1,2};
         sortColors(arr);
         System.out.println(Arrays.toString(arr));
    }
}
