package DSA;

import java.util.Arrays;

public class DuplicateZeros_inPlace {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int l = n;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                c++;
            }
        }
        int j = n + c - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (j < l) arr[j] = 0;
                j--;
                if (j < l) arr[j] = 0;
                j--;
            } else {
                if (j < l) arr[j] = arr[i];
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
