package OOP;

public class AreaCalcuator {

    public int area(int side){
        return side * side;
    }
    public double area(double l,double w){
        return l*w;
    }
    public double area(double radius){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        AreaCalcuator areaCalcuator = new AreaCalcuator();
        System.out.println("Area of square is "+areaCalcuator.area(10));
        System.out.println("Area of rectangle is "+areaCalcuator.area(10,5));
        System.out.println("Area of circle is "+areaCalcuator.area(10.00));
    }
}
