package ShapePackage;

public class Main {
    public static void main(String[] args){
        Triangle tg = new Triangle(10, 5);
        Rectangle rg = new Rectangle(10, 5);
        System.out.println("三角形の面積："+tg.calculateArea());
        System.out.println("長方形の面積："+rg.calculateArea());

        Circle cl = new Circle(5);
        System.out.println("円の面積："+cl.calculateArea());

        ShapeTest st = new ShapeTest();
        Shape[] sp = {tg, rg, cl};
        System.out.println("面積の合計："+st.getTotalArea(sp));
    }
}
