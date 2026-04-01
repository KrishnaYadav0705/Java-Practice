package Basic;

public class PrintNTo1UsingRecursion {
    public static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }
    public static void main(String[] args) {
        printNTo1(5);
    }
}
