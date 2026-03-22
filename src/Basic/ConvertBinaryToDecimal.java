package Basic;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary number");
        String binaryNumber = sc.nextLine();
        int ans = 0;
        int i = 0;
        while(i < binaryNumber.length()){
            if(binaryNumber.charAt(i) == '1'){
                ans = ans + (int) Math.pow(2,binaryNumber.length()-i-1);
            }
            i++;
        }
        System.out.println(ans);
    }
}
