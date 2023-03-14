package quanlyphuongtiengiaothong;

public class XeOTo extends Xe {
    private int soChoNgoi;
    private String kieuDongCo;

    public XeOTo(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, int soChoNgoi, String kieuDongCo) {
        super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public void hienThiPTGT() {
        System.out.println("So Xe: " +getSoXe());
        System.out.println("\tNha San Xuat: " +getNhaSanXuat());
        System.out.println("\tNam San Xuat: " +getNamSanXuat());
        System.out.println("\tMau Xe: " +getMauXe());
        System.out.println("\tChu Xe: " +getChuXe().getHoTen());
        System.out.println("\tSo Cho Ngoi: " +getSoChoNgoi());
        System.out.println("\tKieu Dong Co: " +getKieuDongCo());
    }
}
