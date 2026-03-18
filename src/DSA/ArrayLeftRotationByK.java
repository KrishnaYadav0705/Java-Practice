package DSA;
import java.util.Scanner;
public class ArrayLeftRotationByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("kitni baar left rotate kerana hai");
        int k = sc.nextInt();
        System.out.println("chalo ab array ke element daalo");
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        while(k-- > 0){
            int key = arr[0];
            for(int i = 1; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = key;
        }
        System.out.println("Here your K left rotate array :");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
