/*
21CE001 Harshit Ajakiya
Design a class named Circle containing following attributes and behavior.
        • One double data field named radius. The default value is 1.
        • A no-argument constructor that creates a default circle.
        • A Single argument constructor that creates a Circle with the specified radius.
        • A method named getArea() that returns area of the Circle.
        • A method named getPerimeter() that returns perimeter of it*/
class circle {
    private double radius = 1;

    public circle() {

    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getperameter() {
        return (2 * 3.14 * radius);
    }

    public double getarea() {

        return (3.14 * radius * radius);
    }

}

public class Prac1 {
    public static void main(String[] args) {
        double area;
        circle obj1 = new circle();
        System.out.println("Area Is " + obj1.getarea());
        System.out.println("Perimeter Is " + obj1.getperameter());
        circle obj2 = new circle(2);
        System.out.println("Area Is " + obj2.getarea());
        System.out.println("Perimeter Is " + obj2.getperameter());

    }
}
