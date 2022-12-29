public class Candy extends Product {
    private double weight;

    public Candy() {
    }

    public Candy(double weight) {
        this.weight = weight;
    }

    public Candy(int id, String name, double price, int quantity, Category category, double weight) {
        super(id, name, price, quantity, category);
        this.weight = weight;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "weight=" + weight +
                '}';
    }
}
