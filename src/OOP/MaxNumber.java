package OOP;

public class MaxNumber {
    public int max(int a,int b){
        return a>b?a:b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
//        if(a>b && a>c){
//            return a;
//        }else if(b>a && b>c){
//            return b;
//        }else{
//            return c;
//        }
        int temp;
        if(a>b){
            temp=a;
        }else{
            temp=b;
        }

        return temp>c?temp:c;

    }

    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();
        System.out.println(maxNumber.max(3,4));
        System.out.println(maxNumber.add(1,2,5));

    }
}
