package CircleAndCylinder;

public class TestMain {
    public static void main(String[] args) {
        // an instance of Circle
        Circle c1=new Circle(5,"blue");
        System.out.println(c1);
        System.out.println();
        //an instance of Cylinder
        Cylinder c2=new Cylinder(c1,6);
        System.out.println(c2);
        System.out.println();
        //Testing the getters
        System.out.println("Radius is: "+c2.getBase().getRadius());
        System.out.println("Color is: "+c2.getBase().getColor());
        System.out.println("Height is: "+c2.getHeight());
        System.out.printf("Area of Cylinder: %.2f%n",c2.getArea());
        System.out.println("Area of Circle: "+c1.getArea());

    }
}
