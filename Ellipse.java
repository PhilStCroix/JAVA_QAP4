public class Ellipse extends Shape {

    private double majorAxis;
    private double minorAxis;

    public Ellipse(String shapeName, double a, double b) {
        super(shapeName);
        this.majorAxis = Math.max(a, b);
        this.minorAxis = Math.min(a, b);
    }

    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - Math.pow((majorAxis - minorAxis), 2));
    }
}
