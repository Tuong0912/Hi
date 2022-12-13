public class TaiKhoan {
    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasspass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public TaiKhoan(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public TaiKhoan() {
    }

}
