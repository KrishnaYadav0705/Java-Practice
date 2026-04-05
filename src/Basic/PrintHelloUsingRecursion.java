package Basic;

public class PrintHelloUsingRecursion {
    public static void printHello(int n){
        if(n==0){
            return;
        }
        printHello(n-1);
        System.out.println("Hello "+n);
    }
    public static void main(String[] args) {
        printHello(5);
    }

}
