package DSA;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kitni baar search krana hai");
        int k = sc.nextInt();
        while(k-- > 0) {
            System.out.println("Array kitne size ka chahiye");
            int n = sc.nextInt();
            System.out.println("kya find kernaa hai");
            int m = sc.nextInt();
            int ans = -1;
            System.out.println("Array ki value dalo");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                }
            for(int i = 0; i<n; i++){
                if(arr[i] == m){
                    ans = i;
                    break;
                }
            }
            }
            System.out.println(ans);
        }
    }
}
