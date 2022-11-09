# Hi
public class Shape {
    private String color = "white";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color " + getColor() + " and " + (isFilled() ? "filled " : "not filled");
    }


    public static class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }


        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }


        public String tostring() {
            return "A circle with radius " + getRadius() + ", which is a subclass of " + super.toString();
        }
    }

    public static class Rectangle extends Shape {
        private double width = 1.0;
        private double height = 1.0;

        public Rectangle() {

        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public Rectangle(double width , double height , String color , boolean filled){
            super(color, filled);
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getArea(){
            return this.width * this.height;
        }

        public double getPerimeter(){
            return 2 * ( this.width + this.height);
        }

        public String toString(){
            return " A Rectangle with width " + getWidth() + " with height " + getHeight() + ", which is a subclass of " + super.toString();
        }
    }
    public static class TestRentangle {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            rectangle = new Rectangle(4.2 , 5.7 , "blue" , true);
            System.out.println(rectangle);

            Circle circle = new Circle();
            circle = new Circle(3.5, "indigo", false);
            System.out.println(circle);

            Shape shape = new Shape();
            shape = new Shape("red", false);
            System.out.println(shape);
        }
    }
}
