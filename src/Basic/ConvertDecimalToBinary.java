package Basic;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number");
        int n = sc.nextInt();

        //Conversion using StringBuilder.
        StringBuilder binary = new StringBuilder();
        while(n>0){
            binary.append(n%2);
            n = n/2;
        }
        System.out.println(binary.reverse());

        //Conversion using method.
//        System.out.println(Integer.toBinaryString(n));

        //conversion using String.
//        String binary = "";
//        int temp = n;
//        while(n>0){
//            int t = n%2;
//            binary = t + binary;
//            n = n/2;
//        }
//        System.out.println(temp+" --> "+binary);
    }
}
