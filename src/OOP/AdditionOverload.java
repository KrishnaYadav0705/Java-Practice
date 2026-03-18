package OOP;

public class AdditionOverload {

    public int add(int a){
        return a;
    }

    public int add(int a,int b){
        return a+b;
    }

    public double add(double a,double b){
        return a+b;
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        AdditionOverload obj = new AdditionOverload();
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(1,2));


    }
}
