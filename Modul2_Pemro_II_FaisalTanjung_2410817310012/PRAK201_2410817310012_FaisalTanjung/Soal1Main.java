package Modul2_Pemro_II_FaisalTanjung_2410817310012.PRAK201_2410817310012_FaisalTanjung;
public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apel", 0.4, 7000, 40);
        Fruit mango = new Fruit("Mangga", 0.2, 3500, 15);
        Fruit avocado = new Fruit("Alpukat", 0.25, 10000, 12);
        apple.display();
        mango.display();
        avocado.display();
    }
}