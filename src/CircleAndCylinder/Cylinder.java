package CircleAndCylinder;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base =new Circle();
        height=1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 2*3.14* base.getRadius()*(base.getRadius()+height);
    }

    @Override
    public String toString() {
        return "Cylinder[" +
                "base=" + base +
                ", height=" + height +
                ']';
    }
}
