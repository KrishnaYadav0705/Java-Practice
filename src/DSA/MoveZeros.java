//Program Move zeroes with extra space
// Time Complexity O(n)
//Space Complexity O(n)

package DSA;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        System.out.println("enter the element of array :");

        int count = 0;
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                count++;
            }
        }

        int[] arr2 = new int[size];

        for(int i = size-1; i>=count; i--){
            arr2[i] = 0;
        }
        int c1 = 0;
        for(int i = 0; i<size; i++){
            if(arr[i] != 0){
                arr2[c1++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
