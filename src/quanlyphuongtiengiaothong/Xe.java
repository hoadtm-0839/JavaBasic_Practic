package quanlyphuongtiengiaothong;

import java.util.Comparator;

public abstract class Xe implements Comparable<Xe>, Comparator<Xe> {
    private String soXe;
    private String nhaSanXuat;
    private int namSanXuat;
    private String mauXe;
    private ChuXe chuXe;

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public ChuXe getChuXe() {
        return chuXe;
    }

    public void setChuXe(ChuXe chuXe) {
        this.chuXe = chuXe;
    }

    public Xe(String soXe, String nhaSanXuat, int namSanXuat, String mauXe, ChuXe chuXe) {
        this.soXe = soXe;
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
        this.mauXe = mauXe;
        this.chuXe = chuXe;
    }

    @Override
    public int compareTo(Xe other) {
        return this.soXe.compareTo(other.soXe);// so sánh
    }

    @Override
    public int compare(Xe a, Xe b) {
        return b.soXe.compareTo(a.getSoXe());// chỉ định field cần so sánh
    }

    public abstract void hienThiPTGT();

}
