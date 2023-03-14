package quanlyphuongtiengiaothong;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Tìm kiếm phương tiện giao thông theo số xe
    public static Xe timPTGTTheoSoXe(List<Xe> dsXe, String soXe) {
        for (Xe xe : dsXe) {
            if (xe.getSoXe().equals(soXe)) {
                return xe;
            }
        }
        return null;
    }

    //Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng
    public static Xe timPTGTTheoCMNDChuXe(List<Xe> dsXe, String soCMND) {
        for (Xe xe : dsXe) {
            if (xe.getChuXe().getSoCMND().equals(soCMND)) {
                return xe;
            }
        }
        return null;
    }

    //Sắp xếp các phương tiện giao thông theo số xe giảm dần
    public static List<Xe> sapXepPTGTTheoSoXeGiamDan(List dsXe) {
        Collections.sort(dsXe);
        return dsXe;
    }

    public static void xoaPTGTTheoNhaSanXuat(List<Xe> dsXe, String nhaSanXuat) {
        dsXe.removeIf(xe -> xe.getNhaSanXuat().equals(nhaSanXuat));
    }

    public static void themPTGT(List<Xe> dsXe) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so xe (5 ky tu va khong trung lap trong danh sach): ");
        String soXe = sc.nextLine();
        System.out.println("Nhap nha san xuat (bao gom Honda, Yamaha, Toyota, Suzuki): ");
        String nhaSanXuat = sc.nextLine();
        System.out.println("Nhap nam san xuat (2000 ~ nam hien tai): ");
        int namSanXuat = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap mau xe: ");
        String mauXe = sc.nextLine();
        System.out.println("Nhap thong tin chu xe (so CMND): ");
        String soCMND = sc.nextLine();
        System.out.println("Nhap thong tin chu xe (ho va ten): ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap thong tin chu xe (email): ");
        String eMail = sc.nextLine();
        ChuXe chuXe5 = new ChuXe(soCMND, hoTen, eMail);

        if (soXe.length() == 5) {
            if (timPTGTTheoSoXe(dsXe, soXe) == null) {
                ArrayList<String> dsNhaSanXuat = new ArrayList<>();
                dsNhaSanXuat.add("Honda");
                dsNhaSanXuat.add("Yamaha");
                dsNhaSanXuat.add("Toyota");
                dsNhaSanXuat.add("Suzuki");
                if (dsNhaSanXuat.contains(nhaSanXuat)) {
                    int namHienTai = Year.now().getValue();
                    if (namSanXuat >= 2000 && namSanXuat <= namHienTai) {
                        System.out.println("Nhap loai xe (1 - Xe may; 2 - Xe o to; 3 - Xe tai): ");
                        int loaiXe = Integer.parseInt(sc.nextLine());
                        switch (loaiXe) {
                            case 1: {
                                System.out.println("Nhap cong suat: ");
                                String congSuat = sc.nextLine();
                                Xe xeMay2 = new XeMay(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe5, congSuat);
                                dsXe.add(xeMay2);
                                xeMay2.hienThiPTGT();
                                return;
                            }
                            case 2: {
                                System.out.println("Nhap so cho ngoi: ");
                                int soChoNgoi = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhap kieu dong co: ");
                                String kieuDongCo = sc.nextLine();
                                Xe xeOTo2 = new XeOTo(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe5, soChoNgoi, kieuDongCo);
                                dsXe.add(xeOTo2);
                                xeOTo2.hienThiPTGT();
                                return;
                            }
                            case 3: {
                                System.out.println("Nhap trong tai: ");
                                String trongTai = sc.nextLine();
                                Xe xeTai2 = new XeTai(soXe, nhaSanXuat, namSanXuat, mauXe, chuXe5, trongTai);
                                dsXe.add(xeTai2);
                                xeTai2.hienThiPTGT();
                                return;
                            }
                            default:
                                System.out.println("Loai xe khong hop le");
                                return;
                        }
                    }
                    System.out.println("Nam san xuat khong hop le");
                    return;
                }
                System.out.println("Nha san xuat khong hop le");
                return;
            }
            System.out.println("So xe nay da ton tai");
            return;
        }
        System.out.println("So xe phai la 5 ky tu");
    }

    public static void main(String[] args) {
        ChuXe chuXe1 = new ChuXe("123456789", "Nguyen Van An", "nguyen.van.an@gmail.com");
        ChuXe chuXe2 = new ChuXe("147258369", "Tran Thi Tam", "tran.thi.tam@gmail.com");
        ChuXe chuXe3 = new ChuXe("321654987", "Tran Thi Binh", "tran.thi.binh@gmail.com");
        ChuXe chuXe4 = new ChuXe("741852963", "Le Van Nga", "le.van.nga@gmail.com");

        XeMay xeMay1 = new XeMay("53634", "HonDa", 2009, "Den Bac", chuXe1, "8500hp");
        XeOTo xeOTo1 = new XeOTo("12345", "Toyota", 2010, "Trang", chuXe2, 16, "Dong co xang");
        XeTai xeTai1 = new XeTai("27929", "Suzuki", 2022, "Trang", chuXe3, "3,5T");

//    Thêm phương tiện giao thông 1
        List<Xe> dsXe = new ArrayList<>();
        dsXe.add(xeMay1);
        dsXe.add(xeOTo1);
        dsXe.add(xeTai1);

        System.out.println("Tìm kiếm phương tiện giao thông theo số xe");
        timPTGTTheoSoXe(dsXe, "27929").hienThiPTGT();
        System.out.println("====================");

        System.out.println("Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng");
        timPTGTTheoCMNDChuXe(dsXe, "147258369").hienThiPTGT();
        System.out.println("====================");

        System.out.println("Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ");
        xoaPTGTTheoNhaSanXuat(dsXe, "Toyota");
        for (Xe xe : dsXe) {
            xe.hienThiPTGT();
        }
        System.out.println("====================");

        System.out.println("Sắp xếp các phương tiện giao thông theo số xe giảm dần");
        sapXepPTGTTheoSoXeGiamDan(dsXe);
        for (Xe xe : dsXe) {
            xe.hienThiPTGT();
        }
        System.out.println("====================");

//      Thêm phương tiện giao thông 2
        themPTGT(dsXe);
    }
}
