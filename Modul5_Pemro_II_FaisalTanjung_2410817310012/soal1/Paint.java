package Modul5_Pemro_II_FaisalTanjung_2410817310012.soal1;
public class Paint {
    private double coverage;

    public Paint(double c) {
        this.coverage = c;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / getCoverage();
    }
}