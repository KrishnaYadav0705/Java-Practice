package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Factors_Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                factors.add(i);
                if(i*i != n){
                factors.add(n/i);
                }
            }         
        }
        Collections.sort(factors);
        System.out.println(factors);
    }
}
