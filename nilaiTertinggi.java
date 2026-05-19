import java.util.Scanner;
public class nilaiTertinggi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Buatlah fungsi getNilaiMax() yang menerima array int dan mengembalikan nilai terbesar
        di dalamnya. Gunakan loop untuk membandingkan setiap elemen.
        Hint: simpan nilai sementara int max= arr(0)
        */
       int max = 0;
       int arr[] = {55, 2, 4, 6, 16, 100};
       System.out.print("Nilai terbesar: " +getNilaiMax(arr));
       max = sc.nextInt();
    }
    
    static int getNilaiMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
