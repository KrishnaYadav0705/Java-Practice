package Basic;
import java.util.Scanner;
public class isSorted {
    public static void isSorted(int[] arr){
        String s = "YES";
        for(int i = 1; i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                s = "NO";
                break;
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        isSorted(arr);

    }
}
