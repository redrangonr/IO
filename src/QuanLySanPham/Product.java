package QuanLySanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private String Ma;
    private String Ten;
    private String Hang;
    private int Gia;

    public Product(String ma, String ten, String hang, int gia) {
        Ma = ma;
        Ten = ten;
        Hang = hang;
        Gia = gia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Ma='" + Ma + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Hang='" + Hang + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}
