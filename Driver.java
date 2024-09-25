public class Driver {
    public static void main(String[] args) {
    Circle firstcircle = new Circle();
    Circle secondcircle = new Circle(3);
    Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(3, 3);
        System.out.println(firstcircle);
        System.out.println("getRadius() --> " +firstcircle.getRadius() + " units");
        System.out.println("circumference() --> " +firstcircle.circumference() + " units");
        System.out.println("area() --> " +firstcircle.area() + " units");

        System.out.println(secondcircle);
        System.out.println("getRadius() --> " +firstcircle.getRadius() + " units");
        System.out.println("circumference() --> " +firstcircle.circumference() + " units");
        System.out.println("area() --> " +firstcircle.area() + " units");

        System.out.println(c1);
        System.out.println("getRadius() --> " +c1.getRadius() + " units");
        System.out.println("getHeight() --> " +c1.getHeight() + " units");
        System.out.println("area() --> " +c1.surfacearea());
        System.out.println("volume() --> " +c1.volume() + " units");

        System.out.println(c2);
        System.out.println("getRadius() --> " +c1.getRadius() + " units");
        System.out.println("getHeight() --> " +c1.getHeight() + " units");
        System.out.println("area() --> " +c1.surfacearea());
        System.out.println("volume() --> " +c1.volume() + " units");
    }
}

