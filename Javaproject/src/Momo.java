public class Momo implements ThanhToan {
    @Override
    public void traTien(double soTien, String tenKH) {
        System.out.println("Khách hàng: " + tenKH + ", Tổng tiền: " + soTien + "đ");
        System.out.println("Thanh toán QUA MOMO thành công!");
    }
}
