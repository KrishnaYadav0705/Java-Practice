package Basic;

import java.util.Scanner;

public class SqrtFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 1; i*i <= n; i++){
            ans = i;
        }
        System.out.println(ans);
    }
}
