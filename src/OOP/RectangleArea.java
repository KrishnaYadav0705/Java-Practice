// RectangleArea = length * width;
        package OOP;

import java.util.Scanner;

public class RectangleArea {
    double length;
    double width;

    RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter width");
        double w = sc.nextDouble();

        RectangleArea R = new RectangleArea(l, w);
        System.out.println("Area of rectangle :"+R.getArea());

    }
}


