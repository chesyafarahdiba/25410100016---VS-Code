import java.util.Scanner;
public class luasPersegiPanjang {
    //variabel class level: variabel dibaca/digunakan disemua blok kode
    //keyword static
    static int pj, lb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang = 0, lebar = 0;
        System.out.print("Masukkan panjang (cm): ");
        pj = sc.nextInt();
        System.out.print("Masukkan lebar (cm): ");
        lb = sc.nextInt();
        System.out.println(); //baris kosong

        //memanggil fungsi
        System.out.print("Luas persegi panjang: " + hitungLuas(pj, lb));
    }
    //membuat fungsi
    //tipe data pada parameter = tipe data pada fungsi
    //rumus = panjang * lebar
    static int hitungLuas(int p, int l) {
        int luas = p * l; //hasil dari rumus akan dihitung sesuai angka dari user
        return luas; //hasil luas akan terus dikembalikan nilainya
    }
    /*overloading function: pembuatan fungsi dengan nama yang sama namun dengan jumlah parameter yang berbeda
    */

    //fungsi hitung luas tanpa parameter
    static int hitungLuas() {
        //variabel global >> class level
        int luas = pj * lb;
        return luas;
    }
}
