public class Main {
    public static void main(String[] args) {
        
        SanPham sp1 = new DienTu("E01", "Laptop HP", 15000000, "IMEI001", 12);
        SanPham sp2 = new ThucPham("F01", "Sữa tươi", 30000, "20/12/2025");
        SanPham sp3 = new DienTu("E02", "Tai nghe Sony", 800000, "IMEI002", 6);

        
        DonHang dh1 = new DonHang("Nguyễn Văn A", new TienMat());
        dh1.themSP(sp1);
        dh1.themSP(sp2);

        DonHang dh2 = new DonHang("Nguyễn Văn B", new TheTinDung());
        dh2.themSP(sp3);

        DonHang dh3 = new DonHang("Nguyễn Văn C", new Momo());
        dh3.themSP(sp2);
        dh3.themSP(sp3);

        
        DonHang[] ds = {dh1, dh2, dh3};

        
        for (DonHang dh : ds) {
            dh.thanhToan();
            System.out.println("-----------------------------");
        }
    }
}
