package DSA;

public class GCD_EuclideanAlgo {
    public static int GCD(int a, int b) {
        if (a == b){
            return a;
        }
        if(a > b){
            return GCD(a-b, b);
        }else{
            return GCD(a, b-a);
        }
    }
    public static void main(String[] args) {
        System.out.println(GCD(45,81));
    }
}
