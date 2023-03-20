package quanlykqhtsinhvien;

public class KetQuaHocTap {
    private String tenHocKy;
    float diemTrungBinh;

    public KetQuaHocTap(String tenHocKy, float diemTrungBinh) {
        this.tenHocKy = tenHocKy;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTenHocKy() {
        return tenHocKy;
    }

    public void setTenHocKy(String tenHocKy) {
        this.tenHocKy = tenHocKy;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
