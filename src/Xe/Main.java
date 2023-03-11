package Xe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void tinh_thue(Object obj) {
//        if(obj instanceof XeDap){
//            System.out.println("Khong ton thue");
//        }
    }

    public static void main(String[] args) {
        List<IXe> dsXe = new ArrayList();
        IXe xeDap1 = new XeDap(700);
        IXe xeMay1 = new XeMay(1200);
        IXe xeOToTai1 = new XeOToTai(1800);
        IXe xeOToKhach1 = new XeOToKhach(2200, 5);

        dsXe.add(xeDap1);
        dsXe.add(xeMay1);
        dsXe.add(xeOToTai1);
        dsXe.add(xeOToKhach1);


        for (int i = 0; i < dsXe.size(); i++) {
            dsXe.get(i).ThongTinXe();
            dsXe.get(i).TienThue();
//            tinh_thue(dsXe.get(i));
        }

    }

}
