package Animal;

public class Animal {
    protected String ten;
    protected int tuoi;
    protected String giong;

    public Animal(String ten, int tuoi, String giong) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.giong = giong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGiong() {
        return giong;
    }

    public void setGiong(String giong) {
        this.giong = giong;
    }

    public void displayinfo() {
        System.out.println("Meo con ten " + ten + ", tuoi: " + tuoi + ", giong: " + giong);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("bo", 2, "duc", "vang", 2.2f);
        d1.displayinfo();

        Cat c1 = new Cat("ga", 3, "cai", "tam the", 10.2f);
        c1.displayinfo();

        Animal cat = new Cat("an", 3, "duc", "do", 3.3f);
        cat.displayinfo();
    }

}
