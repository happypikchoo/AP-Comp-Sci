public class Circle {

        double radius;

        public Circle() {
            radius = 1;

        }

        public Circle(double a) {
            radius = a;

        }

        public String toString() {

            return "Hello, I am a circle with a radius of " + radius;
        }

        public double getRadius() {
            return radius;
        }

        public double circumference() {
            return 2* java.lang.Math.PI*radius;

        }

    public double area() {
          return java.lang.Math.PI*radius*radius;

    }

}



