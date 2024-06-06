// Kelas untuk penjual
public class Seller {
    private String name; // Nama penjual
    private String contactInfo; // Informasi kontak penjual

    // Konstruktor untuk menginisialisasi nama dan kontak penjual
    public Seller(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getter untuk nama penjual
    public String getName() {
        return name;
    }

    // Getter untuk kontak penjual
    public String getContactInfo() {
        return contactInfo;
    }
}
