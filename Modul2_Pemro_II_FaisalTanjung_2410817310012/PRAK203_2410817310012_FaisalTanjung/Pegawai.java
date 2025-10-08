package Modul2_Pemro_II_FaisalTanjung_2410817310012.PRAK203_2410817310012_FaisalTanjung;
public class Pegawai {
    public String nama;
    // pada baris ini terjadi error karena menggunakan tipe data char seharusnya String
    public String asal; //public char asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    // pada barus dibawah ini terjadi error karena variabel j tidak dideklarasikan
    public void setJabatan(String j){//public void setJabatan()
        this.jabatan = j;
    }
}