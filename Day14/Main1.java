class AreaCalculator {

    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}

public class Main1 {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        double circleArea = ac.calculateArea(5);
        double rectangleArea = ac.calculateArea(4, 6); 

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
