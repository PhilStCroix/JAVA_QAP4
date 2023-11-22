public class Circle extends Shape {
    private double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        System.out.println(circle.toString());

    }
}
