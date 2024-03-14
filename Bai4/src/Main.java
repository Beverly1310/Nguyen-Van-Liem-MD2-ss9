public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,10);
        Shape circle = new Circle(10);
        System.out.println(circle.getColor());
        circle.setColor("Black");
        System.out.println(circle.getColor());
        System.out.println("Dien tich HCN la: "+rectangle.getArea());
        System.out.println("Dien tich hinh tron la: "+circle.getArea());
        System.out.println(circle.display());
    }
}
