package quanlykqhtsinhvien;

import java.time.LocalDate;
import java.util.List;

public class SinhVienTaiChuc extends SinhVien {
    private String noiLienKetDaoTao;

    public SinhVienTaiChuc(String maSinhVien, String hoTen, LocalDate ngaySinh, int namNhapHoc, float diemDauVao, List<KetQuaHocTap> dsKetQuaHocTap, String noiLienKetDaoTao) {
        super(maSinhVien, hoTen, ngaySinh, namNhapHoc, diemDauVao, dsKetQuaHocTap);
        this.noiLienKetDaoTao = noiLienKetDaoTao;
    }
}
