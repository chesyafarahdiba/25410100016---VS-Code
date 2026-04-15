import java.util.Scanner ;

public class miewacoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Deklarasi Variable
        String namaPelanggan = "";
        int pilihanMenu;
        String namaMenu = "";
        String namaMenu1 = "";
        String kategoriMenu = "";
        int hargaMenu = 0;
        int hargaMenu1 = 0;
        int jumlahPesanan;
        int jumlahPesanan1;
        int totalHarga;
        int metodePembayaran;
        int uangBayar;
        String namaMetode;
        
        //Input Nama Pelanggan
        System.out.println("Masukkan Nama Pelanggan: ");
        namaPelanggan = scanner.nextLine();

        //Input Menu Makanan
        System.out.println("DAFTAR MENU MAKANAN");
        System.out.println("1. Mie Wacoan Level 0   - 10000");
        System.out.println("2. Mie Wacoan Level 1   - 11000");
        System.out.println("3. Mie Wacoan Level 2   - 12000");
        System.out.println("4. Mie Wacoan Level 3   - 13000");
        System.out.println("Pilih Menu Makanan: ");
        pilihanMenu = scanner.nextInt();

        System.out.println("Jumlah Pesanan Makanan: ");
        jumlahPesanan = scanner.nextInt();
                
        //Pesan Menu Makanan
        if (pilihanMenu == 1) {
            namaMenu = "Mie Wacoan Level 0";
            hargaMenu = 10000;
            kategoriMenu = "Makanan";
        } else if (pilihanMenu == 2) {
            namaMenu = "Mie Wacoan Level 1";
            hargaMenu = 11000;
            kategoriMenu = "Makanan";
        } else if (pilihanMenu == 3) {
            namaMenu = "Mie Wacoan Level 2";
            hargaMenu = 12000;
            kategoriMenu = "Makanan";
        } else if (pilihanMenu == 4) {
            namaMenu = "Mie Wacoan Level 3";
            hargaMenu = 13000;
            kategoriMenu = "Makanan";
        } else {
            System.out.println("Menu tidak tersedia!");
            return;
        }

        //Input Menu Minuman
        System.out.println("DAFTAR MENU MINUMAN");
        System.out.println("1. Es Teh   - 8000");
        System.out.println("2. Milo     - 10000");
        System.out.println("3. Thai Tea - 9000");
        System.out.println("Pilih Menu Minuman: ");
        pilihanMenu = scanner.nextInt();

        System.out.println("Jumlah Pesanan Minuman: ");
        jumlahPesanan1 = scanner.nextInt();
                
        //Pesan Menu Minuman
        if (pilihanMenu == 1) {
            namaMenu1 = "Es Teh";
            hargaMenu1 = 8000;
            kategoriMenu = "Minuman";
        } else if (pilihanMenu == 2) {
            namaMenu1 = "Milo";
            hargaMenu1 = 10000;
            kategoriMenu = "Minuman";
        } else if (pilihanMenu == 3) {
            namaMenu1 = "Thai Tea";
            hargaMenu1 = 9000;
            kategoriMenu = "Minuman";
        } else {
            System.out.println("Menu tidak tersedia!");
            return;
        }
        
        totalHarga = (hargaMenu * jumlahPesanan) + (hargaMenu1 * jumlahPesanan1);

        //Input Metode Pembayaran
        System.out.println("\n1. Cash : ");
        System.out.println("\n2. QRIS : ");
        System.out.println("\n3. Debet: ");
        metodePembayaran = scanner.nextInt();

        //Metode Pembayaran
        if (metodePembayaran == 1) {
            namaMetode = "Cash";
            System.out.println("Masukkan uang bayar: ");
            uangBayar = scanner.nextInt();
        } else if (metodePembayaran == 2) {
            namaMetode = "QRIS";
        } else if (metodePembayaran == 3) {
            namaMetode = "Debet";
        } else {
            System.out.println("Metode tidak tersedia!: ");
            return;
        }

        //Output Struk Pesanan
        System.out.println("===== Struk Pembelian =====");
        System.out.println("Nama Pelanggan  : " + namaPelanggan);
        System.out.println("Menu Makanan    : " + namaMenu);
        System.out.println("Jumlah          : " + jumlahPesanan);
        System.out.println("Menu Minuman    : " + namaMenu1);
        System.out.println("Jumlah          : " + jumlahPesanan1);
        System.out.println("Total           : " + totalHarga);
        System.out.println("Pembayaran      : " + namaMetode);
        System.out.println("====================");

    }
}
