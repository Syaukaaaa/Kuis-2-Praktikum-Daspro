import java.util.Scanner;
// Syauka Daffa Aryasatya_SIB 1A_Absen 27
public class Soal1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = 5;
        int bilanganganjil=0;
         int bilangangenap=0;
        int[] daftarBilangan = new int[bilangan];

        System.out.println("Masukkan " + bilangan + "angka");

        for (int i = 1; i <= bilangan; i++) { //Masukin Pake Looping  
            System.out.print("Masukkan Nilai Array ke-" + i + " = ");
            daftarBilangan[i-1] = sc.nextInt();

        } System.out.println();

        for(int i=0;i<daftarBilangan.length;i++){ //Mengecek Genap Ganjil 
            if (daftarBilangan[i]%2==0) {
                System.out.println("Bilangan:" + daftarBilangan[i] +" "+"Adalah Bilangan Genap");
                bilangangenap++;
            }

            else{
                System.out.println("Bilangan:" + daftarBilangan[i] +" "+"Adalah Bilangan Ganjil");
                bilanganganjil++;
            }
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Bulat dalam Array Adalah:"+bilangangenap);
        System.out.println("Jumlah Bilangan Ganjil Dalam Array Adalah:"+bilanganganjil);
    }
}

