package quanlykqhtsinhvien;

import java.time.LocalDate;
import java.util.List;

public class SinhVienChinhQuy extends SinhVien {
    public SinhVienChinhQuy(String maSinhVien, String hoTen, LocalDate ngaySinh, int namNhapHoc, float diemDauVao, List<KetQuaHocTap> dsKetQuaHocTap) {
        super(maSinhVien, hoTen, ngaySinh, namNhapHoc, diemDauVao, dsKetQuaHocTap);
    }
}
