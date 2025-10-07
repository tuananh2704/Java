public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double gia;

    public SanPham(String maSP, String tenSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public abstract void hienThiThongTin();
}
