package Basic;

import org.apache.groovy.groovysh.Main;

public class Print1ToNUsingRecursion {
    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

   public static void main(String[] args) {
        print1ToN(5);
    }

}
