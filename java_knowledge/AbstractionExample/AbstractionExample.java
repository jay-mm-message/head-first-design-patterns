// 抽象类
abstract class Shape {
    // 抽象方法，没有具体实现
    public abstract double area();

    // 普通方法
    public void display() {
        System.out.println("This is a shape.");
    }
}

// 派生类1：圆形
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // 重写抽象方法
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// 派生类2：矩形
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 重写抽象方法
    @Override
    public double area() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());

        circle.display();
        rectangle.display();
    }
}

