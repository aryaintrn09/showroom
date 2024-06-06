// Kelas untuk pembelian
public class Purchase {
    private Showroom showroom; // Referensi ke showroom
    private Buyer buyer; // Referensi ke pembeli

    // Konstruktor untuk menginisialisasi showroom dan pembeli
    public Purchase(Showroom showroom, Buyer buyer) {
        this.showroom = showroom;
        this.buyer = buyer;
    }

    // Metode untuk melakukan pembelian kendaraan
    public void makePurchase(int vehicleIndex) {
        Vehicle vehicleToPurchase = showroom.getVehicle(vehicleIndex); // Mendapatkan kendaraan berdasarkan indeks
        if (vehicleToPurchase != null) {
            buyer.purchaseVehicle(vehicleToPurchase); // Pembeli membeli kendaraan
            System.out.println("Purchase successful!"); // Menampilkan pesan sukses
        } else {
            System.out.println("Invalid vehicle index."); // Menampilkan pesan kesalahan jika indeks tidak valid
        }
    }
}
