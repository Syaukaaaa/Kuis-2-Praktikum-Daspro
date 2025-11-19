// Syauka Daffa Aryasatya - SIB 1A

import java.util.Scanner;

public class Soal3_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[][] penjualan = new int[7][4]; 
    String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
    String[] produk = {"A", "B", "C", "D"};

        for (int i = 0; i < 7; i++) { // Input data Penjualan 
            System.out.println("Hari: " + hari[i]);
            for (int j = 0; j < 4; j++) {
                System.out.print("  Produk " + produk[j] + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Total penjualan per produk");
            System.out.println("2. Total penjualan per hari");
            System.out.println("3. Produk dengan penjualan tertinggi");
            System.out.println("4. Hari dengan penjualan tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {

                case 1: // Total Penjualan Per Produk
                    for (int j = 0; j < 4; j++) {
                        int total = 0;
                        for (int i = 0; i < 7; i++) {
                            total += penjualan[i][j];
                        }
                        System.out.println("Produk " + produk[j] + ": " + total);
                    }
                    break;

                case 2:
                    for (int i = 0; i < 7; i++) {// Total Penjualan Dalam Sehari
                        int total = 0;
                        for (int j = 0; j < 4; j++) {
                            total += penjualan[i][j];
                        }
                        System.out.println(hari[i] + ": " + total);
                    }
                    break;

                case 3:
                    int maxProduk = -1;// Produk Yang Laris
                    int maxTotal = -1;

                    for (int j = 0; j < 4; j++) {
                        int total = 0;
                        for (int i = 0; i < 7; i++) {
                            total += penjualan[i][j];
                        }
                        if (total > maxTotal) {
                            maxTotal = total;
                            maxProduk = j;
                        }
                    }

                    System.out.println("Produk tertinggi: " + produk[maxProduk] + " (" + maxTotal + ")");
                    break;

                case 4:
                    int maxHari = -1;// Hari Penjualan Terbesar
                    int maxHarian = -1;

                    for (int i = 0; i < 7; i++) {
                        int total = 0;
                        for (int j = 0; j < 4; j++) {
                            total += penjualan[i][j];
                        }
                        if (total > maxHarian) {
                            maxHarian = total;
                            maxHari = i;
                        }
                    }

                    System.out.println("Hari tertinggi: " + hari[maxHari] + " (" + maxHarian + ")");
                    break;

                case 5:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);
        sc.close();
    }
}
