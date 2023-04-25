package ShapePackage;

public class Triangle implements Shape{
    private double vertical;
    private double beside;
    private static final int TWO = 2;

    public Triangle(double vertical, double beside) {
        this.vertical = vertical;
        this.beside = beside;
    }

    @Override
    public double calculateArea() {
        return (this.vertical * this.beside) / TWO;
    }
}
