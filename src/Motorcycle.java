// Kelas untuk sepeda motor, turunan dari Vehicle
public class Motorcycle extends Vehicle {
    private double price; // Harga motor

    // Konstruktor untuk menginisialisasi brand, model, dan harga
    public Motorcycle(String brand, String model, double price) {
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
        System.out.println("Motorcycle Brand: " + getBrand()); // Menampilkan merek motor
        System.out.println("Motorcycle Model: " + getModel()); // Menampilkan model motor
        System.out.println("Motorcycle Price: " + getPrice()); // Menampilkan harga motor
    }
}
