package Basic;
import java.util.Scanner;
public class SecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int great = Math.max(arr[0],arr[1]);
        int secGreat = Math.min(arr[0],arr[1]);
        int i = 2;
        while(i<size){
            if(arr[i] > great){
                secGreat = great;
                great = arr[i];
            }else if(arr[i] > secGreat){
                secGreat = arr[i];
            }
            i++;
        }

        System.out.println("Second greatest element = "+secGreat);
    }
}
