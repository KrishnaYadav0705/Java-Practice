package Basic;

import java.util.Scanner;

public class SumOfNUsingRecursion {
    public static int sum(int n) {
        //Write your code here
        if(n == 1) return 1;;

        return n+sum(n-1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(sum(n));


    }

}
