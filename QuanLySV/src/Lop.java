public class Lop {
    private String tenLop;

    public Lop(String tenLop) { //Constructor có tham số
        this.tenLop = tenLop;
    }

    public Lop() {
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) { //getter
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return tenLop;
    }
}
