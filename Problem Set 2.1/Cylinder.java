public class Cylinder {
    double height;
    Circle base;
    //default constructor
    public Cylinder() {
    height = 1.0;
    base = new Circle(1);
    }

    public Cylinder(double h, double r) {
        height = h;
        base = new Circle(r);
    }

    public String toString() {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and a height of " + height;
    }


    public double getRadius() {
        return base.getRadius();

    }
    public double getHeight() {
        return height;

    }


    public double volume() {

        return height*base.area();
    }

    public double surfacearea() {
        return base.area()*2+base.circumference()*height;

    }
}
