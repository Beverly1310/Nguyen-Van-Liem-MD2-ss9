public class Circle extends Shape{
    private double radius;
    public Circle(){
    }

    public Circle(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        final double pi=3.14;
        return pi*radius*radius;
    }
}
