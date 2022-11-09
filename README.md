# Hi
public class Circle {
    private double radius = 2.0;
    private String color = "green";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A circle with radius " + getRadius() + " and color" + getColor();
    }

    public static class Cylinder extends Circle {
        private double height = 5.0;


        public Cylinder() {
        }

        public Cylinder(double height) {
            this.height = height;
        }

        public Cylinder(double height, double radius, String color) {
            super(radius, color);
            this.height = height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public double getThetich(){
            return Math.PI * getRadius() * getRadius() * height ;
        }

        @Override
        public String toString() {
            return super.toString() + " Height: " +height;
        }

        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder();
            System.out.println(cylinder);

            cylinder = new Cylinder(19 ,1.0,"white" );
            System.out.println(cylinder.toString());
        }
    }
}
