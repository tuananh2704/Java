import java.util.*;

public class DonHang {
    private String tenKH;
    private ArrayList<SanPham> danhSach = new ArrayList<>();
    private ThanhToan hinhThuc;

    public DonHang(String tenKH, ThanhToan hinhThuc) {
        this.tenKH = tenKH;
        this.hinhThuc = hinhThuc;
    }

    public void themSP(SanPham sp) {
        danhSach.add(sp);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (SanPham sp : danhSach) tong += sp.getGia();
        return tong;
    }

    public void thanhToan() {
        System.out.println("Khách hàng: " + tenKH);
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : danhSach) {
            sp.hienThiThongTin();  
        }

        double tong = tinhTongTien();
        System.out.println("Tổng tiền: " + tong + "đ");
        hinhThuc.traTien(tong, tenKH);
    }
}
