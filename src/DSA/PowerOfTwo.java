package DSA;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean getPowerOfTwo(int n) {
        return n > 0 && (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Output : "+getPowerOfTwo(n));
    }
}
