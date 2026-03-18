package DSA;

public class BinarySearch {
    public static int binarySearch(int[] arr,int n,int key){
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 1;
        int n = arr.length;
        int result = binarySearch(arr,n,key);
        System.out.println("index found at :"+result);

    }
}
