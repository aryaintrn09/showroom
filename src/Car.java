// Kelas untuk mobil, turunan dari Vehicle
public class Car extends Vehicle {
    private double price; // Harga mobil

    // Konstruktor untuk menginisialisasi brand, model, dan harga
    public Car(String brand, String model, double price) {
        super(brand, model); // Memanggil konstruktor superclass
        this.price = price;
    }

    // Implementasi metode abstract getPrice
    @Override
    public double getPrice() {
        return price;
    }

    // Implementasi metode displayDetails dari VehicleOperations
    @Override
    public void displayDetails() {
        System.out.println("Car Brand: " + getBrand()); // Menampilkan merek mobil
        System.out.println("Car Model: " + getModel()); // Menampilkan model mobil
        System.out.println("Car Price: " + getPrice()); // Menampilkan harga mobil
    }
}
