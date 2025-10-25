package Modul3_Pemro_II_FaisalTanjung_2410817310012.soal1;
import java.util.Random;
public class Dadu {
    private int nilai;
    private Random random = new Random();

    public void acakNilai() {
        nilai = random.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}