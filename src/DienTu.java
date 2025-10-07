public class DienTu extends SanPham {
    private String imei;
    private int baoHanh; 

    public DienTu(String maSP, String tenSP, double gia, String imei, int baoHanh) {
        super(maSP, tenSP, gia);
        this.imei = imei;
        this.baoHanh = baoHanh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Điện tử - " + tenSP + " | IMEI: " + imei + " | Bảo hành: " + baoHanh + " tháng | Giá: " + gia);
    }
}
