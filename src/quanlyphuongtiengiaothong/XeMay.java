package quanlyphuongtiengiaothong;

public class XeMay extends Xe {
    private String congSuat;

    public XeMay(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, String congSuat) {
        super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    public void hienThiPTGT() {
        System.out.println("So Xe: " +getSoXe());
        System.out.println("\tNha San Xuat: " +getNhaSanXuat());
        System.out.println("\tNam San Xuat: " +getNamSanXuat());
        System.out.println("\tMau Xe: " +getMauXe());
        System.out.println("\tChu Xe: " +getChuXe().getHoTen());
        System.out.println("\tCong Suat: " +getCongSuat());
    }
}
