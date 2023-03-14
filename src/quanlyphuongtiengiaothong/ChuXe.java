package quanlyphuongtiengiaothong;

public class ChuXe {
    private String soCMND;
    private String hoTen;
    private String eMail;

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {

        this.eMail = eMail;
    }

    public ChuXe(String soCMND, String hoTen, String eMail) {
        setSoCMND(soCMND);
        setHoTen(hoTen);
        seteMail(eMail);
    }
}
