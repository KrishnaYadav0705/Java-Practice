package OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCheck {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter fisrt number :");
        int a = Integer.parseInt(br.readLine());
        System.out.println("Enter second number :");
        int b = Integer.parseInt(br.readLine());

        if(a%2==0 && b%2==0){
            System.out.println("Both number are Even");
        }else if(a%2!=0 && b%2!=0){
            System.out.println("Both number are Odd");
        }else if(a%2==0 && b%2!=0){
            System.out.println("a is Even and b is Odd");
        }else if(a%2!=0 && b%2==0){
            System.out.println("a is Odd and b is Even");
        }else{
            System.out.println("Wrong input!!!");
        }
    }
}
