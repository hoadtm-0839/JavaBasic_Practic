package Xe;

public class XeDap implements IXe {
    double tienXe;

    public XeDap(double tienXe) {
        this.tienXe = tienXe;
    }

    @Override
    public void ThongTinXe() {
        System.out.println("ThongTinXe_XeDap");
        System.out.println("- TienXe:" + tienXe);
    }

    @Override
    public void TienThue() {
        System.out.println("- Khong Dong Thue");
    }
}
