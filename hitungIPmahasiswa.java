import java.util.Scanner;

public class hitungIPmahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Deklarasi Variabel
        int totalSKS = 0;
        int totalNilai = 0;
        int sksMax;

        //Input Mata Kuliah 1
        System.out.println("Masukkan SKS MK1: ");
        int sks1 = scanner.nextInt();
        System.out.println("Masukkan nilai MK1 (A/B/C/D/E): ");
        char nilai1 = scanner.next().toUpperCase().charAt(0);

        //Input Mata Kuliah 2
        System.out.println("Masukkan SKS MK2: ");
        int sks2 = scanner.nextInt();
        System.out.println("Masukkan nilai MK2 (A/B/C/D/E): ");
        char nilai2 = scanner.next().toUpperCase().charAt(0);

        //Input Mata Kuliah 3
        System.out.println("Masukkan SKS MK3: ");
        int sks3 = scanner.nextInt();
        System.out.println("Masukkan nilai MK3 (A/B/C/D/E): ");
        char nilai3 = scanner.next().toUpperCase().charAt(0);
        
        //Konversi Nilai
        int n1 = (nilai1=='A') ? 4 : (nilai1=='B') ? 3 : (nilai1=='C') ? 2 : (nilai1=='D') ? 1 : 0;
        int n2 = (nilai2=='A') ? 4 : (nilai2=='B') ? 3 : (nilai2=='C') ? 2 : (nilai2=='D') ? 1 : 0;
        int n3 = (nilai3=='A') ? 4 : (nilai3=='B') ? 3 : (nilai3=='C') ? 2 : (nilai3=='D') ? 1 : 0;
        
        //Hitung Total
        totalSKS = sks1 + sks2 + sks3;
        totalNilai = (sks1 * n1) + (sks2 * n2) + (sks3 * n3);

        //Hitung IP
        double ip = (double) totalNilai / totalSKS;

        //Menentukan jumlah SKS maksimal
        if (ip >= 3.50) {
            sksMax = 24;
        } else if (ip >= 3.00) {
            sksMax = 22;
        } else if (ip >= 2.00) {
            sksMax = 20;
        } else {
            sksMax = 18;
        }
        
        //Output
        System.out.println("\n===== HASIL =====");
        System.out.println("Total Nilai     : " +totalNilai);
        System.out.println("Total SKS       : " +totalSKS);
        System.out.printf("IP Semester    : %.2f\n", ip);
        System.out.println("SKS Maksimal    : " +sksMax);

        scanner.close();
    }
}