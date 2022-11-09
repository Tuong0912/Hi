# Hi
public class Car {
    private final String name ;
    private final String  engine;

    public static int numberOfCar;


    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public Car(String name , String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }

    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }

    public static class TestStaticPropety{
        public static void main(String[] args) {
            Car car1 = new Car("Mazda 3","Skyactiv 3");
            System.out.println(Car.numberOfCar + car1.getName() + car1.getEngine());
            Car car2 = new Car("Mazda 6","Skyactiv 6");
            System.out.println(car2.getEngine()+car2.getName());
        }

    }
}
