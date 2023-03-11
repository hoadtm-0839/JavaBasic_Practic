package Xe;

public class XeOToKhach implements IXe {
    double tienXe;
    int soChoNgoi;

    public XeOToKhach(double tienXe, int soChoNgoi) {
        this.tienXe = tienXe;
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public void ThongTinXe() {
        System.out.println("ThongTinXe_XeOToKhach");
        System.out.println("- TienXe:" + tienXe);
    }

    @Override
    public void TienThue() {
        double vat = tienXe * 0.1;
        double thueTruocBa = tienXe * 0.02;
        double thueTieuThu;
        if (soChoNgoi > 0 && soChoNgoi < 5)
            thueTieuThu = tienXe * 0.5;
        else thueTieuThu = tienXe * 0.3;

        System.out.println("- Tien Thue: " + (vat + thueTruocBa + thueTieuThu));

    }
}
