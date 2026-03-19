package DSA;

import java.util.Arrays;

public class ConcatenateArray {
    public static int[] concatenate(int[] arr, int n){
        int[] arr2 = new int[n+n];
        for(int i = 0; i<n; i++) {
            arr2[i] = arr[i];
        }
        int j = 0;
        for(int i = n; i<n+n; i++){
            arr2[i] = arr[j++];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(concatenate(arr, n)));


    }
}
