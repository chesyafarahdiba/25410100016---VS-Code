import java.util.Scanner;
public class latihanSurabayaZoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi variabel
        String[] kategori = new String[0];
        int[] harga = new int[0];
        int[] jumlahBeli = new int[0];
        int total = 0, menu = 0, jumlahData = 0;

        //menu
        do { //mengulang menu
            System.out.println("Pemesanan Tiket Surabaya Zoo");
            System.out.println("1. Input kategori dan harga");
            System.out.println("2. Input jumlah beli");
            System.out.println("3. Hitung total");
            System.out.println("4. Keluar program");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();

        //percabangan menu
        switch (menu) {
            case 1:
                //menu 1 >> isian data bebas sesuai user >> input kategori dan harga
                System.out.print("Berapa jumlah data: ");
                jumlahData = sc.nextInt();

                sc.nextLine();
                
                //deklarasi ulang array
                kategori = new String[jumlahData];
                harga = new int[jumlahData];
                
                //input dan output array menggunakan loop (for)
                //indeks array harus dimulai dari 0
                for (int i = 0; i < kategori.length; i++) {
                    System.out.print("Input kategori: ");
                    kategori[i] = sc.nextLine();
                    System.out.print("Input harga: ");
                    harga[i] = sc.nextInt();
                    sc.nextLine();
                    System.out.println(); //baris kosong;   

                }
                /*
                    kategori[0] = zoo only
                    kategori[1] = zoo + edupark
                    kategori[2] = zoo + edupark + animal show

                    harga[0] = 15000
                    harga[1] = 35000
                    harga[2] = 50000
                */

                //output
                for (int i = 0; i < harga.length; i++) {
                    System.out.println("Kategori ke-"+(i+1)+" :" + kategori[i]); //kategori ke-1
                }
                break;
            case 2:
                //menu2 >> input jumlah beli
                if (jumlahData == 0) {
                    System.out.println("Data belum diinput, pilih menu 1 dulu");
                    break;
                }

                jumlahBeli = new int[jumlahData];

                for (int i = 0; i < jumlahData; i++) {
                    System.out.println("Berapa jumlah beli untuk " + kategori[i]+ ": "); 
                    jumlahBeli[i] = sc.nextInt();  
                }
                break;
            case 3:
                //menu3 >> hitung total pembelian tiket
                if (jumlahData == 0) {
                    System.out.println("Data belum lengkap!");
                    break;
                }

                total = 0;
                System.out.println("--- Rincian Pembelian ---");
                for (int i = 0; i < jumlahData; i++) {
                    int subtotal = harga[i] * jumlahBeli[i];
                    total += subtotal;

                    System.out.println(kategori[i] + 
                                " | Harga: " + harga[i] + 
                                " | Jumlah: " + jumlahBeli[i] + 
                                " | Subtotal: " + subtotal);
                }

                System.out.println("Total bayar: " + total);
                break;
            case 4:
                //menu4 >> keluar program
                System.out.println("Terima kasih!");
                System.exit(0);
                break;
            }
        } while (true);

    }
        
}