public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle", 5);
        shapes[1] = new Ellipse("Ellipse", 5, 10);
        shapes[2] = new Triangle("Triangle", 5, 10, 8);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
