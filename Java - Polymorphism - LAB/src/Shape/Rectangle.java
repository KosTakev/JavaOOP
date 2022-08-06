package Shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return this.width * 2 + this.height * 2;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
