package quanlykqhtsinhvien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Sinh Vien 1
        KetQuaHocTap kQHT1SV1 = new KetQuaHocTap("HK1-2022", 5.6f);
        KetQuaHocTap kQHT2SV1 = new KetQuaHocTap("HK2-2022", 5.8f);
        List<KetQuaHocTap> dsKQHTSV1 = new ArrayList<KetQuaHocTap>();
        dsKQHTSV1.add(kQHT1SV1);
        dsKQHTSV1.add(kQHT2SV1);
        SinhVien sv1 = new SinhVienChinhQuy("CQ_001", "Nguyen Van A", LocalDate.of(29, 9, 1988), 2022, 6.8f, dsKQHTSV1);

        // Sinh Vien 2
        KetQuaHocTap kQHT1SV2 = new KetQuaHocTap("HK1-2022", 6.4f);
        KetQuaHocTap kQHT2SV2 = new KetQuaHocTap("HK2-2022", 7.3f);
        List<KetQuaHocTap> dsKQHTSV2 = new ArrayList<KetQuaHocTap>();
        dsKQHTSV2.add(kQHT1SV2);
        dsKQHTSV2.add(kQHT2SV2);
        SinhVien sv2 = new SinhVienChinhQuy("CQ_002", "Tran Thi Nga", LocalDate.of(24, 9, 1984), 2022, 7.8f, dsKQHTSV2);

        // Sinh Vien 3
        KetQuaHocTap kQHT1SV3 = new KetQuaHocTap("HK1-2022", 7.6f);
        KetQuaHocTap kQHT2SV3 = new KetQuaHocTap("HK2-2022", 8.2f);
        List<KetQuaHocTap> dsKQHTSV3 = new ArrayList<KetQuaHocTap>();
        dsKQHTSV3.add(kQHT1SV3);
        dsKQHTSV3.add(kQHT2SV3);
        SinhVien sv3 = new SinhVienChinhQuy("CQ_003", "Nguyen Van Ba", LocalDate.of(29, 9, 1988), 2022, 6.8f, dsKQHTSV1);

        // Sinh Vien 4
        KetQuaHocTap kQHT1SV4 = new KetQuaHocTap("HK1-2022", 7.6f);
        KetQuaHocTap kQHT2SV4 = new KetQuaHocTap("HK2-2022", 8.2f);
        List<KetQuaHocTap> dsKQHTSV4 = new ArrayList<KetQuaHocTap>();
        dsKQHTSV4.add(kQHT1SV4);
        dsKQHTSV4.add(kQHT2SV4);
        SinhVien sv4 = new SinhVienTaiChuc("TC_001", "Nguyen Van An", LocalDate.of(29, 9, 1988), 2022, 6.8f, dsKQHTSV1, "Da Nang");

        // Sinh Vien 5
        KetQuaHocTap kQHT1SV5 = new KetQuaHocTap("HK1-2022", 6.5f);
        KetQuaHocTap kQHT2SV5 = new KetQuaHocTap("HK2-2022", 7.3f);
        List<KetQuaHocTap> dsKQHTSV5 = new ArrayList<KetQuaHocTap>();
        dsKQHTSV5.add(kQHT1SV5);
        dsKQHTSV5.add(kQHT2SV5);
        SinhVien sv5 = new SinhVienTaiChuc("TC_001", "Le Van Lang", LocalDate.of(29, 9, 1988), 2022, 6.8f, dsKQHTSV1, "Da Nang");


    }
}
