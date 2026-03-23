package DSA;

import java.util.Scanner;

public class GCD_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int ans = Math.min(a, b);
        while(ans != 0){
            if(a % ans == 0 && b % ans == 0){
                break;
            }
            ans -= 1;

        }
        System.out.println("GCD of " + a + " and " + b + " is " + ans);
    }
}
