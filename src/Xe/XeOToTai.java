package Xe;

public class XeOToTai implements IXe {
    double tienXe;

    public XeOToTai(double tienXe) {
        this.tienXe = tienXe;
    }

    public void ThongTinXe() {
        System.out.println("ThongTinXe_XeMay");
        System.out.println("- TienXe:" + tienXe);
    }

    @Override
    public void TienThue() {
        double vat = tienXe * 0.1;
        double thueTruocBa = tienXe * 0.02;
        System.out.println("- Tien Thue: " + (vat + thueTruocBa));
    }

}
