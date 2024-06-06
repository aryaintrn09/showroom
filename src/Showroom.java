// Kelas untuk showroom
public class Showroom {
    private Vehicle[] vehicles; // Array kendaraan yang tersedia di showroom
    private Seller seller; // Informasi penjual

    // Konstruktor untuk menginisialisasi array kendaraan dan penjual
    public Showroom(Vehicle[] vehicles, Seller seller) {
        this.vehicles = vehicles;
        this.seller = seller;
    }

    // Metode untuk menampilkan inventory showroom
    public void displayInventory() {
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(); // Menampilkan detail kendaraan
            System.out.println("--------------------");
        }
    }

    // Metode untuk menampilkan informasi penjual
    public void displaySellerInfo() {
        System.out.println("Seller Name: " + seller.getName()); // Menampilkan nama penjual
        System.out.println("Seller Contact: " + seller.getContactInfo()); // Menampilkan kontak penjual
    }

    // Metode untuk mendapatkan kendaraan berdasarkan indeks
    public Vehicle getVehicle(int index) {
        if (index >= 0 && index < vehicles.length) {
            return vehicles[index]; // Mengembalikan kendaraan jika indeks valid
        } else {
            return null; // Mengembalikan null jika indeks tidak valid
        }
    }
}
