package QuanLyHocSinh;

public class TruongHoc {
    String lop;
    String hoTen;
    Integer tuoi;
    String queQuan;

    public TruongHoc themThongTin(String lop, String hoTen, Integer tuoi, String queQuan) {
        this.lop = lop;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        return this;
    }

    public void hienThiThongTin() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("- Lop: " + lop);
        System.out.println("- Tuoi: " + tuoi);
        System.out.println("- Que quan: " + queQuan);
    }
}
