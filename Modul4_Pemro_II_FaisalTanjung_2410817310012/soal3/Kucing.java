package Modul4_Pemro_II_FaisalTanjung_2410817310012.soal3;
public class Kucing extends HewanPeliharaan {
    private String furColor;

    public Kucing(String name, String breed, String furColor) {
        super(name, breed);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu: " + getFurColor());
    }
}