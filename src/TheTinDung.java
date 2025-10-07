public class TheTinDung implements ThanhToan {
    @Override
    public void traTien(double soTien, String tenKH) {
        System.out.println("Khách hàng: " + tenKH + ", Tổng tiền: " + soTien + "đ");
        System.out.println("Thanh toán BẰNG THẺ TÍN DỤNG thành công!");
    }
}
