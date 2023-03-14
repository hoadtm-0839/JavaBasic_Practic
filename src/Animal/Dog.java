package Animal;

public class Dog extends Animal {
    private String mausac;
    private float trongluong;

    public Dog(String ten, int tuoi, String giong, String mausac, float trongluong) {
        super(ten, tuoi, giong);
        this.mausac = mausac;
        this.trongluong = trongluong;
    }

    public void displayinfo() {
        System.out.println("Cho con ten " + ten + ", tuoi: " + tuoi + ", giong: " + giong + ", mau sac: " + mausac + ", trong luong: " + trongluong);
    }
}
