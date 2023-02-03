package QuanLyKhachHang;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public Customer() {
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
