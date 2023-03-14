package quanlyphuongtiengiaothong;

public class XeTai extends Xe {
    private String trongTai;

    public XeTai(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe, String trongTai) {
        super(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    public void hienThiPTGT() {
        System.out.println("So Xe: " +getSoXe());
        System.out.println("\tNha San Xuat: " +getNhaSanXuat());
        System.out.println("\tNam San Xuat: " +getNamSanXuat());
        System.out.println("\tMau Xe: " +getMauXe());
        System.out.println("\tChu Xe: " +getChuXe().getHoTen());
        System.out.println("\tTrong Tai " +getTrongTai());
    }
}
