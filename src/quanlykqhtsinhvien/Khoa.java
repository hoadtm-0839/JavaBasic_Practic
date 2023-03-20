package quanlykqhtsinhvien;

import java.util.List;
import java.util.ArrayList;

public class Khoa {
    private String tenKhoa;
    private List<SinhVien> dsSinhVien;

    public Khoa(String tenKhoa, List<SinhVien> dsSinhVien) {
        this.tenKhoa = tenKhoa;
        this.dsSinhVien = dsSinhVien;
    }

    //    xac dinh tong so SV chính quy cua khoa?
    public int tongSoSVChinhQuy() {
        int dem = 0;
        for (int i = 1; i <= dsSinhVien.size(); i++) {
            if (dsSinhVien.get(i) instanceof SinhVienChinhQuy) {
                dem = dem + 1;
            }
        }
        return dem;
    }

    //    tim ra SV có diem dau vao cao nhat o moi khoa
    public SinhVien svCoDiemDaoVaoCaoNhat() {
        SinhVien svCoDiemDaoVaoCaoNhat = null;
        float diemDauVaoCaoNhat = 0;
        for (int i = 1; i <= dsSinhVien.size(); i++) {
            if (diemDauVaoCaoNhat < dsSinhVien.get(i).getDiemDauVao()) {
                diemDauVaoCaoNhat = dsSinhVien.get(i).getDiemDauVao();
                svCoDiemDaoVaoCaoNhat = dsSinhVien.get(i);
            }
        }
        return svCoDiemDaoVaoCaoNhat;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public List<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(List<SinhVien> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }
}
