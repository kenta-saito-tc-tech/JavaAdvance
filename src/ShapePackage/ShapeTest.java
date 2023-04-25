package ShapePackage;

public class ShapeTest {
    private double total;
    public double getTotalArea(Shape[] spArray){
        for (int i = 0; i < spArray.length; i++){
            this.total += spArray[i].calculateArea();
        }
        return this.total;
    }
}
