// Kelas abstract untuk kendaraan, mengimplementasikan VehicleOperations
public abstract class Vehicle implements VehicleOperations {
    private String brand; // Merek kendaraan
    private String model; // Model kendaraan

    // Konstruktor untuk menginisialisasi brand dan model
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getter untuk brand
    public String getBrand() {
        return brand;
    }

    // Getter untuk model
    public String getModel() {
        return model;
    }

    // Abstract method untuk mendapatkan harga kendaraan
    public abstract double getPrice();
}
