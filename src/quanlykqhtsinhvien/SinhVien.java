package quanlykqhtsinhvien;

import java.time.LocalDate;
import java.util.List;

public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private int namNhapHoc;
    private float diemDauVao;
    private List<KetQuaHocTap> dsKetQuaHocTap;

    public SinhVien(String maSinhVien, String hoTen, LocalDate ngaySinh, int namNhapHoc, float diemDauVao, List<KetQuaHocTap> dsKetQuaHocTap) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.namNhapHoc = namNhapHoc;
        this.diemDauVao = diemDauVao;
        this.dsKetQuaHocTap = dsKetQuaHocTap;
    }

    //    tra ve thong tin SV co phai la chinh quy hay khong?
    public void kiemTraLoaiSV() {
        if (this instanceof SinhVienChinhQuy) {
            System.out.println(this.getHoTen() + "là SV chinh quy");
            return;
        }
        System.out.println(this.getHoTen() + "là SV tai chuc");
    }

    //  hien thi diem trung binh các ky hoc cua SV
    public void tinhDiemTrungBinh() {
        float diemTrungBinh = 0;
        for (int i = 1; i <= dsKetQuaHocTap.size(); i++) {
            diemTrungBinh = diemTrungBinh + dsKetQuaHocTap.get(i).getDiemTrungBinh();
        }
        diemTrungBinh = diemTrungBinh / dsKetQuaHocTap.size();
        System.out.println(this.getHoTen() + "co diem trung binh: " + diemTrungBinh);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getNamNhapHoc() {
        return namNhapHoc;
    }

    public void setNamNhapHoc(int namNhapHoc) {
        this.namNhapHoc = namNhapHoc;
    }

    public float getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(float diemDauVao) {
        this.diemDauVao = diemDauVao;
    }

    public List<KetQuaHocTap> getDsKQHT() {
        return dsKetQuaHocTap;
    }

    public void setDsKQHT(List<KetQuaHocTap> dsKQHT) {
        this.dsKetQuaHocTap = dsKQHT;
    }
}
