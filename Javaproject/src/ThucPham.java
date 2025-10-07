public class ThucPham extends SanPham {

    private String hanSuDung;

    public ThucPham(String maSP, String tenSP, double gia, String hanSuDung) {
        super(maSP, tenSP, gia);
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Thực phẩm: " + tenSP + " | HSD: " + hanSuDung + " | Giá: " + gia);
    }
}
