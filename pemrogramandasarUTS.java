import java.util.Scanner;
public class pemrogramandasarUTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int[] jumlahPelanggan = new int[0];
        String[] namaProvider = new String[0];
        String[] jenisPaket  = new String[0];
        int[] nominalPulsa = new int[0];
        int[] cashback = new int[0];
        int[] biayaAdmin = new int[2000];
        int total, biaya, menu = 0;

        //menu
        do {
            System.out.println("Pembelian Pulsa");
            System.out.println("1. Input jumlah pelanggan");
            System.out.println("2. Hitung total");
            System.out.println("3. Keluar program");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

        //percabangan menu
        switch (menu) {
            case 1: //input jumlah pelanggan
                System.out.println("Masukkan jumlah pelanggan: ");
                jumlahPelanggan[0] = sc.nextInt();

                sc.nextLine();

                for (int i = 0; i < namaProvider.length; i++) {
                    System.out.println("Input nama provider: ");
                    namaProvider[0] = sc.nextLine();
                    System.out.println("Input jenis paket: ");
                    jenisPaket[0] = sc.nextLine();
                    System.out.println("Input nominal pulsa: ");
                    nominalPulsa[0] = sc.nextInt();
                }
                /*
                    namaProvider[0] = telkomsel
                    namaProvider[1] = indosat
                    namaProvider[2] = tri

                    jenisPaket[0] = internet
                    jenisPaket[1] = internet + social media
                    jenisPaket[2] = internet + social media + internet sepuasnya

                    nominalPulsa[0] = 100000
                    nominalPulsa[1] = 50000
                    nominalPulsa[2] = 25000
                    nominalPulsa[3] = 15000
                */
                break;
        
            case 2: //hitung total
                System.out.println("--- Rincian Pembelian ---");
                for (int i = 0; i < jumlahPelanggan.length; i++) {
                    int subtotal = nominalPulsa[0] : cashback[i];
                    
                    if (total >= 100000) {
                        cashback[0] = 15/100;
                    } else if (total >= 50000) {
                        cashback[0] = 10/100;
                    } else {
                        cashback[0] = 0;
                    }
                    total += subtotal;
                    int bayar = nominalPulsa[0] + biayaAdmin[0];
                }
                break;

            case 3:
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
        }
        } while (true);

        sc.close();
    }
}
