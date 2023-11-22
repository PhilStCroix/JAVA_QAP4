import java.text.DecimalFormat;

public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Shape: " + shapeName + ", Perimeter: " + df.format(calculatePerimeter()) + ", Area: " + df.format(calculateArea());
    }
}
