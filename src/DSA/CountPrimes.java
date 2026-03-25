//Sieve of Eratosthenes
package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int p = (int)(Math.sqrt(n));
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = prime[1] = false;
        for(int i=2;i<=p;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i = 2;i <= n; i++){
            if(prime[i]){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nTotal count :"+count);
    }
}
