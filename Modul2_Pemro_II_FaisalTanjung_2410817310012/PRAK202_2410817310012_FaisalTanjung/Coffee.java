package Modul2_Pemro_II_FaisalTanjung_2410817310012.PRAK202_2410817310012_FaisalTanjung;
public class Coffee {
    public String nameOfCoffee;
    public String size;
    public double price;
    private String buyer;

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }
    public String getBuyer(){
        return buyer;
    }
    public double getTax(){
        return price * 0.11;
    }
    public void info(){
        System.out.println("Nama Kopi: " + nameOfCoffee);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }
}