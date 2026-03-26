package DSA;

import java.util.Scanner;

public class Pow_x_n {
    public static double pow(double x, int n) {
        if (n == 0) return 1.0;
        if(n == Integer.MIN_VALUE){
            return 1.0/(x * pow(x,-(n+1)));
        }
        if(n < 0){
            return 1.0/pow(x,-n);
        }
        double ans = pow(x,n/2);
        if(n % 2 == 0){
            ans = ans*ans;
        }else{
            ans = ans*ans*x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = sc.nextDouble();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Output : "+pow(x,n));

    }
}
