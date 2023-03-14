package Animal;

public class Cat extends Animal{
    private String maulong;
    private float chieucao;

    public Cat(String ten, int tuoi, String giong, String maulong, float chieucao) {
        super(ten, tuoi, giong);
        this.maulong = maulong;
        this.chieucao = chieucao;
    }

    public void displayinfo() {
        super.displayinfo();
        displayinfo();
        System.out.println( ", mau long: " + maulong + ", chieu cao: " +chieucao);
    }
//        System.out.println("Meo con ten "+ten +", tuoi: " +tuoi + ", giong: " +giong + ", mau long: " + maulong + ", chieu cao: " +chieucao);}
}
