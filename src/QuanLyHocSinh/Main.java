package QuanLyHocSinh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static void hienThiHocSinh20Tuoi(List<TruongHoc> dsHocSinh) {
        for (int i = 0; i < dsHocSinh.size(); i++) {
            if (dsHocSinh.get(i).tuoi == 20) {
                dsHocSinh.get(i).hienThiThongTin();
            }
        }
    }

    private static void hienThiHocSinh23TuoiQueQN(List<TruongHoc> dsHocSinh) {
        int soLuong = 0;
        for (int i = 0; i < dsHocSinh.size(); i++) {
            if (dsHocSinh.get(i).tuoi == 23 && dsHocSinh.get(i).queQuan == "DN") {
                dsHocSinh.get(i).hienThiThongTin();
                soLuong++;
            }
        }
        System.out.println("So luong hoc sinh 23 tuoi va que o DN: " + soLuong);
    }

    public static void main(String[] args) {
        List<TruongHoc> dsHocSinh = new ArrayList();
        TruongHoc hocSinh1 = new TruongHoc();
        TruongHoc hocSinh2 = new TruongHoc();
        TruongHoc hocSinh3 = new TruongHoc();
        TruongHoc hocSinh4 = new TruongHoc();

        dsHocSinh.add(hocSinh1.themThongTin("12/3", "Nguyen Van Ba", 20, "DN"));
        dsHocSinh.add(hocSinh2.themThongTin("12/3", "Le Thi Lan", 23, "DN"));
        dsHocSinh.add(hocSinh3.themThongTin("12/3", "Tran Van Cau", 20, "QN"));
        dsHocSinh.add(hocSinh4.themThongTin("12/3", "Nguyen Thi An", 23, "DN"));

        System.out.println("===== Danh sach hoc sinh 20 tuoi =====");
        hienThiHocSinh20Tuoi(dsHocSinh);
        System.out.println("\n===== Danh sach hoc sinh 23 tuoi va que DN =====");
        hienThiHocSinh23TuoiQueQN(dsHocSinh);
    }
}
