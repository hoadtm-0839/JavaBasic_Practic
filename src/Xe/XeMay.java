package Xe;

public class XeMay implements IXe {

    double tienXe;

    public XeMay(double tienxe) {
        this.tienXe = tienxe;
    }

    @Override
    public void ThongTinXe() {
        System.out.println("ThongTinXe_XeMay");
        System.out.println("- TienXe:" + tienXe);
    }

    @Override
    public void TienThue() {
        double vat = tienXe * 0.1;
        double thueTruocBa = tienXe * 0.05;
        System.out.println("- Tien Thue: " + (vat + thueTruocBa));
    }
}
