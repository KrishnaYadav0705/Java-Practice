package DSA;
import java.util.Scanner;
public class SquareRootBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n =  sc.nextInt();
        int s = 1,l = n; long ans = 0;
        while(s<=l){
            int mid = s+(l-s)/2;
            if(mid*mid <= n){
                ans = mid; s = mid+1;
            }else{
                l = mid-1;
            }
        }
        System.out.println((int)ans);

    }
}
