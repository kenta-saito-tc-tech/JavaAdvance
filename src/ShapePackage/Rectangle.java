package ShapePackage;

public class Rectangle implements Shape{
    private double vertical;
    private double beside;

    public Rectangle(double vertical, double beside) {
        this.vertical = vertical;
        this.beside = beside;
    }

    @Override
    public double calculateArea() {
        return this.vertical * this.beside;
    }
}
