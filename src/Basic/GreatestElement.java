package Basic;
import java.util.Scanner;
public class GreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int great = 0;
        for(int i = 1; i<size; i++){
            if(arr[i] > arr[great]){
                great = i;
            }
        }

        System.out.println("Max element = "+arr[great]+" found at index "+great);
    }
}
