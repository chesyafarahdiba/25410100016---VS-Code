import java.util.Scanner;
public class latihanloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            Membuat program utk menghitung total SSKM berdasarkan
            kegiatan dan poin SSKM dari kegiatan yang diinputkan.
            Kegiatan bisa diinput hingga 5 data.

            output:
            Bimbingan karir - 5 poin
            Seminar AI - 3 poin
            Total : 8 poin
        */

        //input - inisialisasi variabel dan nilai default
        String namaKegiatan = "";
        int poinSSKM = 0, total = 0;

        //pengulangan input data 5x
        //shortcut for >> fori + enter/tab
        for (int i = 1; i <= 5; i++) {
            //isi input
            System.out.println("Data ke: " +i); //cetak urutan data
            System.out.print("Nama kegiatan: ");
            namaKegiatan = sc.nextLine();
            System.out.print("Poin SSKM: ");
            poinSSKM = sc.nextInt();
            System.out.println();
            sc.nextLine(); //resolve bug

            //hitung total = 3+5+7+10+dst = xxx
            total +=poinSSKM; //total = total + poinSSKM
                              // 0 = 0 + 3
                              // 3 = 3 + 5
                              // dst
        }

        //output total SSKM
        System.out.println("Total: " +total);
        
        sc.close();
    }
}
