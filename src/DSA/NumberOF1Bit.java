package DSA;

public class NumberOF1Bit {
    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}
