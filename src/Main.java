// File: Main.java
import java.util.Scanner; // Import Scanner untuk membaca input dari pengguna

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek kendaraan
        Vehicle car1 = new Car("Toyota", "Camry", 30000);
        Vehicle car2 = new Car("Honda", "Civic", 20000);
        Vehicle bike1 = new Motorcycle("Yamaha", "YZF-R3", 5000);
        Vehicle bike2 = new Motorcycle("Ducati", "Monster 821", 12000);

        // Memasukkan kendaraan ke dalam array
        Vehicle[] vehicles = {car1, car2, bike1, bike2};

        // Membuat objek penjual
        Seller seller = new Seller("John Doe", "123-456-7890");

        // Membuat objek pembeli
        Buyer buyer = new Buyer("Jane Smith", "098-765-4321");

        // Membuat objek showroom
        Showroom showroom = new Showroom(vehicles, seller);

        // Membuat objek purchase
        Purchase purchase = new Purchase(showroom, buyer);

        // Menampilkan inventory showroom
        System.out.println("Showroom Inventory:");
        showroom.displayInventory();

        // Menampilkan informasi penjual
        System.out.println("\nSeller Information:");
        showroom.displaySellerInfo();

        // Menampilkan informasi pembeli
        System.out.println("\nBuyer Information:");
        System.out.println("Buyer Name: " + buyer.getName());
        System.out.println("Buyer Contact: " + buyer.getContactInfo());

        // Membaca input dari pengguna untuk memilih kendaraan yang akan dibeli
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner
        System.out.println("\nEnter the index of the vehicle you want to purchase (starting from 0):");
        int vehicleIndex = scanner.nextInt(); // Membaca input pengguna

        // Pembeli membeli kendaraan dengan indeks tertentu
        System.out.println("\nBuyer makes a purchase:");
        purchase.makePurchase(vehicleIndex); // Pembeli membeli kendaraan berdasarkan indeks yang diinput

        // Menampilkan detail pembelian pembeli
        System.out.println("\nPurchase Details:");
        buyer.displayPurchaseDetails(); // Menampilkan detail kendaraan yang dibeli
        scanner.close(); // Close the scanner object
    }
}
