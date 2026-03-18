package Basic;
import java.util.Scanner;
import java.util.Arrays;
public class CopyArrayReverse {
    public static void printArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr1 = new int[size];
        for(int i = 0; i<size; i++){
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[size];
        int i = 0;
        int j = size-1;
        while(size-- > 0){
            arr2[i++] = arr1[j--];
        }
        // System.out.println(Arrays.toString(arr2));
        System.out.println("copy array reverse:");
       printArray(arr2);

    }
}
