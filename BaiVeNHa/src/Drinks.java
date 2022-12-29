public class Drinks extends Product {
    private double volume;
    private String bottleType;

    public Drinks(double volume, String bottleType) {
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public Drinks(int id, String name, double price, int quantity, Category category, double volume, String bottleType) {
        super(id, name, price, quantity, category);
        this.volume = volume;
        this.bottleType = bottleType;
    }

    public double volume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String bottleType() {
        return bottleType;
    }

    public void setBottleType(String bottleType) {
        this.bottleType = bottleType;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "volume=" + volume +
                ", bottleType='" + bottleType + '\'' +
                '}';
    }
}
