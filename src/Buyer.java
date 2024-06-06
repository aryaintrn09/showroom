// Kelas untuk pembeli
public class Buyer {
    private String name; // Nama pembeli
    private String contactInfo; // Informasi kontak pembeli
    private Vehicle purchasedVehicle; // Kendaraan yang dibeli

    // Konstruktor untuk menginisialisasi nama dan kontak pembeli
    public Buyer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.purchasedVehicle = null; // Awalnya belum ada kendaraan yang dibeli
    }

    // Getter untuk nama pembeli
    public String getName() {
        return name;
    }

    // Getter untuk kontak pembeli
    public String getContactInfo() {
        return contactInfo;
    }

    // Metode untuk menetapkan kendaraan yang dibeli
    public void purchaseVehicle(Vehicle vehicle) {
        this.purchasedVehicle = vehicle;
    }

    // Metode untuk menampilkan detail pembelian
    public void displayPurchaseDetails() {
        if (purchasedVehicle != null) {
            System.out.println("Buyer Name: " + name); // Menampilkan nama pembeli
            System.out.println("Purchased Vehicle:");
            purchasedVehicle.displayDetails(); // Menampilkan detail kendaraan yang dibeli
        } else {
            System.out.println("No vehicle purchased."); // Menampilkan pesan jika belum ada kendaraan yang dibeli
        }
    }
}
