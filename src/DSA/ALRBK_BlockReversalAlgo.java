//Time Complexity : O(n)
//Space Complexity : O(1)

//Approach:
// We rotate the array by k positions using the Block Reversal Algorithm.
// Steps:
//       1 - Reverse the first k elements.
//       2 - Reverse the remaining n‑k elements.
//       3 - Reverse the entire array.
// This gives a left rotation of the array by k positions.


package DSA;
import java.util.Arrays;
import java.util.Scanner;

public class ALRBK_BlockReversalAlgo {
    public static void reverseArray(int[] arr, int i, int j) {
       while(i < j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = sc.nextInt();
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}


