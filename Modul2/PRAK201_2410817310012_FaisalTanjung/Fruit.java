package Modul2.PRAK201_2410817310012_FaisalTanjung;
public class Fruit {
    private String nameOfFruit;
    private double weight;
    private double price;
    private double totalWeight;

    public Fruit(String nameOfFruit, double weight, double price, double totalWeight) {
        this.nameOfFruit = nameOfFruit;
        this.weight = weight;
        this.price = price;
        this.totalWeight = totalWeight;
    }

    public void setNameOfFruit(String nameOfFruit) {
        this.nameOfFruit = nameOfFruit;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getNameOfFruit() {
        return nameOfFruit;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public double pricePerKg() {
        return price / weight;
    }
    public double priceBeforeDiscount(){
        return pricePerKg() * totalWeight;
    }
    public double discount(){
        double discount = totalWeight / 4;
        return (int) discount * (price * 4) * 0.02;
    }
    public double priceAfterDiscount(){
        return priceBeforeDiscount() - discount();
    }

    public void display(){
        System.out.println("Nama Buah: " + getNameOfFruit());
        System.out.println("Berat per buah: " + getWeight() + " kg");
        System.out.println("Harga per buah: Rp " + getPrice());
        System.out.println("Total berat beli: " + getTotalWeight() + " kg");
        System.out.printf("Harga per kg: Rp %.2f\n", pricePerKg());
        System.out.printf("Harga sebelum diskon: Rp %.2f\n", priceBeforeDiscount());
        System.out.printf("Diskon: Rp %.2f\n", discount());
        System.out.printf("Harga setelah diskon: Rp %.2f\n", priceAfterDiscount());
        System.out.println();
    }
}