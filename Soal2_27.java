
//Syauka Daffa Aryasatya_SIB 1A_Absen 27
import java.util.Scanner;

public class Soal2_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // masukin buat jumlah array nya
        System.out.print("Masukkan Jumlah Kota: ");
        int kota = scanner.nextInt();
        System.out.println("Masukkan Jumlah Hari:");
        int hari = scanner.nextInt();

        double[][] suhu = new double[kota][hari]; // masukin untuk isi arraynya
        for (int i = 0; i < kota; i++) {
            System.out.println("Masukan data untuk Kota " + (i + 1));
            for (int j = 0; j < hari; j++) {
                System.out.print("Suhu Hari ke-" + (j + 1) + ": ");
                suhu[i][j] = scanner.nextDouble();
            }
        }
        double[] rata = new double[kota];

         for (int i = 0; i < kota; i++) {
            double maksimum = suhu[i][0];
            double minimum = suhu[i][0];
            double total = 0;

            for (int j = 0; j < hari; j++) {
                double nilai = suhu[i][j];
                if (nilai > maksimum) {
                    maksimum = nilai;
                }
                if (nilai < minimum) {
                    minimum = nilai;
                }
                total += nilai;
            }

            double rataKota = total / hari;
            rata[i] = rataKota;

            System.out.println("Kota " + (i + 1));
            System.out.println("  Suhu Maksimum : " + maksimum);
            System.out.println("  Suhu Minimum  : " + minimum);
            System.out.println("  Rata-rata     : " + rataKota);
            System.out.println();
        }
        int Tertinggi = 0; // Mencari Kota Dengan Suhu tertinggi & Terendah 
        int Terendah = 0;
        for (int i = 1; i < kota; i++) {
            if (rata[i] > rata[Tertinggi]) {
                Tertinggi = i;
            }
            if (rata[i] < rata[Terendah]) {
                Terendah = i;
            }
        }

        System.out.println();
        System.out.println("Kota dengan rata-rata suhu tertinggi: Kota " 
        + (Tertinggi + 1) + " (rata = " + rata[Tertinggi] + ")");
        System.out.println("Kota dengan rata-rata suhu terendah : Kota " 
        + (Terendah + 1) + " (rata = " + rata[Terendah] + ")");
        scanner.close();
    }
}
