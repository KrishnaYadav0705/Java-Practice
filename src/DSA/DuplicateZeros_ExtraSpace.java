package DSA;

import java.util.Arrays;

public class DuplicateZeros_ExtraSpace {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                c++;
            }
        }
        int j = n+c-1;
        int[] nums = new int[n+c];
        for(int i = n-1; i>=0; i--){
            if(arr[i] == 0){
                nums[j] = 0;
                nums[j-1] = 0;
                j -= 2;
            }else{
                nums[j] = arr[i];
                j--;
            }
        }

        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
