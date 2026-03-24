package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Factors_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                factors.add(i);
            }
        }
        System.out.println(factors);
    }
}
