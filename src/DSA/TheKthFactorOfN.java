package DSA;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class TheKthFactorOfN {
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if(i*i != n){
                    factors.add(n / i);
                }
            }
        }
        int ans = -1;
        Collections.sort(factors);
        if(k <= factors.size()){
            ans = factors.get(k-1);
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n");
        int n = input.nextInt();
        System.out.println("enter k :");
        int k = input.nextInt();
        System.out.println("kth factor is :"+kthFactor(n,k));


    }
}
